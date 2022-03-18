package org.sqli.authentification.dao;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false )
    private int id ;
    private String login ;
    private String password ;
    private boolean enabled;
    private int loginAttempts;

    @OneToOne
    private Group group ;

    public User() {
    }

    public User(int id, String login, String password, boolean enabled, int loginAttempts) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.enabled = enabled;
        this.loginAttempts = loginAttempts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }
}
