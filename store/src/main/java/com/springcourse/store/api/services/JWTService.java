package com.springcourse.store.api.services;

import com.springcourse.store.api.model.LocalUser;

public interface JWTService {
    public String generateJWT(LocalUser user);
    public String getUsername(String token);
}
