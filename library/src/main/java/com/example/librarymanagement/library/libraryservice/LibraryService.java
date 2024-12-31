package com.example.librarymanagement.library.libraryservice;

import com.example.librarymanagement.library.Entity.Library;
import com.example.librarymanagement.library.libraryrepository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    LibraryRepo libraryRepo;

    public Library addBook(Library book)
    {
        return libraryRepo.save(book);
    }

    public List<Library> getAllBooks()
    {
        return libraryRepo.findAll();
    }

    public void updateBook(int id)
    {
        Library library = libraryRepo.findById(id).get();
        library.setName("Henil");
        library.setNumOfBooks(50);
        libraryRepo.save(library);
    }

    public void deleteBook(int id)
    {

        Library library = libraryRepo.findById(id).get();
        libraryRepo.delete(library);
    }



}
