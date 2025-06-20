package com.springcourse.store.api.services;

import com.springcourse.store.api.model.LocalUser;
import com.springcourse.store.api.model.dtos.LoginBody;
import com.springcourse.store.api.model.dtos.RegistrationBody;
import com.springcourse.store.exception.UserAlreadyExistsException;

public interface UserService {

    LocalUser registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException;
    String loginUser(LoginBody body);
}
