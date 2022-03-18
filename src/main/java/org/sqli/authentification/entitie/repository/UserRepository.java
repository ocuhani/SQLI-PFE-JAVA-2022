package org.sqli.authentification.entitie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sqli.authentification.dao.User;

public interface UserRepository extends JpaRepository<User ,Long> {
    User getUserByLogin(String login);
    User getUserByPassword(String password);
}
