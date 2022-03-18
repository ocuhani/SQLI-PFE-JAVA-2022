package org.sqli.authentification.entitie.services;

import org.springframework.http.HttpEntity;
import org.sqli.authentification.dao.User;

public interface UserService {
    HttpEntity<? extends Object> authLogin(String login , String password);
    User getUserByEmail(String email);
    User getUserByPassword(String password);
    public HttpEntity<? extends Object>  validateLogin(String email, String password);
}
