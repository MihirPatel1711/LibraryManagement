package com.example.librarymanagement.library.librarycontroller;


import com.example.librarymanagement.library.Entity.Library;
import com.example.librarymanagement.library.libraryservice.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @PostMapping("library/add")
    public Library addBook(@RequestBody Library book)
    {
        return libraryService.addBook(book);
    }

    @GetMapping("library/all")
    public List<Library> getAllBooks()
    {
       return libraryService.getAllBooks();
    }

    @PutMapping("library/update/{id}")
    public void updateBook(@PathVariable int id)
    {
        libraryService.updateBook(id);
    }

    @DeleteMapping("library/delete/{id}")
    public void deleteBook(@PathVariable int id)
    {
        libraryService.deleteBook(id);
    }






}
