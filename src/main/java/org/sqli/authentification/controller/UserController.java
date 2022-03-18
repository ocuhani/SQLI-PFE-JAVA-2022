package org.sqli.authentification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import org.sqli.authentification.dao.User;
import org.sqli.authentification.entitie.services.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping(path = {"/","/user"})
public class UserController {
    private UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    @PostMapping("/check")
    public HttpEntity<? extends Object> checkUser(@RequestBody User user , @RequestParam int loginAttempts){
        return  userService.authLogin(user.getLogin() ,user.getPassword());
    }

}
