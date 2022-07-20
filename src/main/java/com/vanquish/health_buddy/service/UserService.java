package com.vanquish.health_buddy.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vanquish.health_buddy.exception.InvalidCredentialsException;
import com.vanquish.health_buddy.exception.ResourceAlreadyExistsException;
import com.vanquish.health_buddy.exception.ResourceNotFoundException;
import com.vanquish.health_buddy.exception.UserNotFoundException;
import com.vanquish.health_buddy.model.user.User;
import com.vanquish.health_buddy.repository.UserRepository;
import com.vanquish.health_buddy.security.AuthRequest;
import com.vanquish.health_buddy.security.AuthResponse;
import com.vanquish.health_buddy.security.JwtUtil;
import com.vanquish.health_buddy.security.RegRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;


@Service
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public UserService(UserRepository userRepository, JwtUtil jwtUtil,
                       PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager,
                       ObjectMapper objectMapper) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
    }

    public User createUser(RegRequest regRequest){
        if(userRepository.existByUsername(regRequest.getUsername()))
            throw new ResourceAlreadyExistsException(User.class, "username", regRequest.getUsername());

        User newUser = User.builder()
                .username(regRequest.getUsername())
                .password(passwordEncoder.encode(regRequest.getPassword()))
                .authority(User.Authority.USER)
                .isActive(true)
                .build();
        return userRepository.save(newUser);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Integer userId){
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException(User.class, "userId", userId));
    }

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username).orElseThrow(()->new ResourceNotFoundException(User.class, "username", username));
    }

    private User findUser(User user){
        User foundUser = null;
        if(user.getUserId()!= null)
            foundUser = userRepository.findById(user.getUserId()).orElse(null);
        if(foundUser == null && user.getUserId() != null)
            foundUser = userRepository.findByUsername(user.getUsername()).orElse(null);
        if(foundUser == null){
            if(user.getUserId()!= null)
                throw new ResourceNotFoundException(User.class, "userId", user.getUserId());
            else
                throw new ResourceNotFoundException(User.class, "username", user.getUsername());
        }
        return foundUser;
    }

    public User updateUser(User user){
        User dbUser = findUser(user);
        Boolean fieldUpdated = false;
        if(user.getUsername() != null){
            dbUser.setUsername(user.getUsername());
            fieldUpdated = true;
        }
        if(user.getPassword() != null){
            dbUser.setPassword(passwordEncoder.encode(user.getPassword()));
            fieldUpdated = true;
        }
        if(user.getFirstName() != null){
            dbUser.setFirstName(user.getFirstName());
            fieldUpdated = true;
        }
        if(user.getLastName() != null){
            dbUser.setLastName(user.getLastName());
            fieldUpdated = true;
        }
        if(user.getAuthority() != null){
            dbUser.setAuthority(user.getAuthority());
            fieldUpdated = true;
        }
        return userRepository.save(dbUser);
    }

    public void deleteUserById(Integer userId){
        if(userRepository.deleteByUserId(userId) == 0) throw new ResourceNotFoundException(User.class, "userId", userId);
    }

    public AuthResponse authenticate(AuthRequest request){
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        } catch(BadCredentialsException e){
            throw new InvalidCredentialsException();
        }

        updateUser(User.builder().username(request.getUsername()).build());

        return new AuthResponse(jwtUtil.generateToken((User) loadUserByUsername(request.getUsername())));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return getUserByUsername(username);
    }
}

/*@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Integer id){
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
    }

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException());
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return (UserDetails) getUserByUsername(username);
    }
}
 */
