package com.springcourse.store.api.services;

public interface EncryptionService {

    public String encryptPassword(String password);
    public boolean checkPassword(String password, String encryptedPassword);


}
