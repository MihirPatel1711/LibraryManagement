package com.example.librarymanagement.library.security;

import com.example.librarymanagement.library.Entity.Library;
import com.example.librarymanagement.library.libraryrepository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private LibraryRepo libraryRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Library library = (Library) libraryRepo.findByUname(username).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        return new User(library.getUname(), library.getPass(), Collections.emptyList());
    }
}
