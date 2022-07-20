package com.vanquish.health_buddy.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity(name = "users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"authorities", "accountNonExpired", "accountNonLocked", "credentialsNonExpired", "enabled", "password"})
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @ColumnDefault("true")
    private boolean isActive = true;

    @Enumerated
    @ColumnDefault("0")
    private Authority authority = Authority.USER;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return Collections.singleton(authority);
    }

    @Override
    public boolean isAccountNonExpired(){
        return isActive;
    }

    @Override
    public boolean isAccountNonLocked(){
        return isActive;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return isActive;
    }


    @Override
    public boolean isEnabled(){
        return isActive;
    }

    public enum Authority implements GrantedAuthority{
        USER("USER"),
        ADMIN("ADMIN");
        private final String value;
        Authority(String authority){
            this.value = authority;
        }


        @Override
        public String getAuthority() {
            return value;
        }
    }
}

/*@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    public Integer getUserId() {
        return userId;
    }

    public User setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
}
 */
