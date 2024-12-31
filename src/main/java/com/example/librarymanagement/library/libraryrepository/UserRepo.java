package com.example.librarymanagement.library.libraryrepository;

import com.example.librarymanagement.library.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<Object> findByUname(String username);
}
