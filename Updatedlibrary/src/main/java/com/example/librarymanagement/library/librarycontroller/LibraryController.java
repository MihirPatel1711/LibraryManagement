package com.example.librarymanagement.library.librarycontroller;


import com.example.librarymanagement.library.Entity.Library;
import com.example.librarymanagement.library.Entity.User;
import com.example.librarymanagement.library.libraryservice.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @PostMapping("/add")
    public Library addBook(@RequestBody Library book)
    {
        return libraryService.addBook(book);
    }

    @GetMapping("/all")
    public List<Library> getAllBooks()
    {
       return libraryService.getAllBooks();
    }

    @PutMapping("/update/{id}")
    public void updateBook(@PathVariable int id)
    {
        libraryService.updateBook(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable int id)
    {
        libraryService.deleteBook(id);
    }


    @PostMapping("/user/add")
    public User addUser(@RequestBody User user) {
        return libraryService.addUser(user);
    }

    @PostMapping("/assign/{userId}/{bookId}")
    public void assignBookToUser(@PathVariable Long userId, @PathVariable int bookId) {
        libraryService.assignBookToUser(userId, bookId);
    }

    @GetMapping("/user/{userId}/books")
    public List<Library> getBooksAssignedToUser(@PathVariable Long userId) {
        return libraryService.getBooksAssignedToUser(userId);
    }






}
