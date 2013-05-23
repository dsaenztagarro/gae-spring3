package com.davlanca.pets.security;

import org.springframework.security.core.GrantedAuthority;

public enum AppRole implements GrantedAuthority {
    ADMIN (0),
    SUPERVISOR(1),
    USER (2);
 
    private int bit;
 
    AppRole(int bit) {
        this.bit = bit;
    }
 
    public String getAuthority() {
        return toString();
    }
}
