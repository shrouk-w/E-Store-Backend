package com.springcourse.store.api.services;

import com.springcourse.store.api.model.LocalUser;
import com.springcourse.store.api.model.dao.LocalUserDAO;
import com.springcourse.store.api.model.dtos.RegistrationBody;
import com.springcourse.store.exception.UserAlreadyExistsException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private LocalUserDAO userDAO;

    public UserServiceImpl(LocalUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public LocalUser registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException {
        if (userDAO.findByUsernameIgnoreCase(registrationBody.getUsername()).isPresent()
                || userDAO.findByEmailIgnoreCase(registrationBody.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
        LocalUser user = new LocalUser();
        user.setEmail(registrationBody.getEmail());
        user.setUsername(registrationBody.getUsername());
        user.setEmail(registrationBody.getEmail());
        user.setLastName(registrationBody.getLastName());
        user.setFirstName(registrationBody.getFirstName());
        //TODO: encrypt password
        user.setPassword(registrationBody.getPassword());
        return userDAO.save(user);
    }


}
