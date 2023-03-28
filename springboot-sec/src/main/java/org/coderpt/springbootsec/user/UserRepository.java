package org.coderpt.springbootsec.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    //gets the findAll,put, remove and others

    Optional<User> findByEmail(String email);
}
