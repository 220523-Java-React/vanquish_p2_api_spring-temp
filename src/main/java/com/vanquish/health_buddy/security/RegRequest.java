package com.vanquish.health_buddy.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class RegRequest {
    private String username;
    private String password;
}
