package com.example.librarymanagement.library.libraryrepository;

import com.example.librarymanagement.library.Entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibraryRepo extends JpaRepository<Library,Integer> {


    Optional<Object> findByUname(String username);
}


