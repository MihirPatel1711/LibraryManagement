package com.example.librarymanagement.library.libraryservice;

import com.example.librarymanagement.library.Entity.Library;
import com.example.librarymanagement.library.Entity.User;
import com.example.librarymanagement.library.libraryrepository.LibraryRepo;
import com.example.librarymanagement.library.libraryrepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    LibraryRepo libraryRepo;

    @Autowired
    UserRepo userRepo;

    public Library addBook(Library book)
    {
        return libraryRepo.save(book);
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public void assignBookToUser(Long userId, int bookId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Library book = libraryRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        user.getBooks().add(book);
        userRepo.save(user);
    }

    public List<Library> getBooksAssignedToUser(Long userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        return user.getBooks();
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
