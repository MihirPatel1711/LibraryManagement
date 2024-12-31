package com.example.librarymanagement.library.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {


    public User(Long id, String username, String password, List<Library> books) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.books = books;
    }

    public User()
    {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;

    @ManyToMany
    @JoinTable(
            name = "user_books",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Library> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Library> getBooks() {
        return books;
    }

    public void setBooks(List<Library> books) {
        this.books = books;
    }
}
