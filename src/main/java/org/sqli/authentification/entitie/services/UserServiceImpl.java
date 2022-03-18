package org.sqli.authentification.entitie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.sqli.authentification.dao.Group;
import org.sqli.authentification.dao.User;
import org.sqli.authentification.entitie.repository.UserRepository;

import static org.springframework.http.HttpStatus.*;

@Service
public class UserServiceImpl implements UserService{
    public static final String AUTHENTICATION_ERROR = "Authentication error";
    Group group =new Group(AUTHENTICATION_ERROR);
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public HttpEntity<? extends Object>  validateLogin(String email, String password){
        if (getUserByPassword(password) == null || getUserByEmail(email) == null){
            return new ResponseEntity<>(group, NOT_FOUND);
        }
        return new ResponseEntity<>(getUserByEmail(email) , OK);
}

    @Override
    public HttpEntity<? extends Object> authLogin(String email, String password) {
        return validateLogin(email , password);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUserByLogin(email);
    }

    @Override
    public User getUserByPassword(String password) {
        return null;
    }

}
