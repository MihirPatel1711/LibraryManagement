package com.example.librarymanagement.library.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String author;

    @Column(name = "num_of_books")
    private int numOfBooks;

    @ManyToMany(mappedBy = "books")
    private List<User> users;


    public Library() {}

    public Library(int id, String name, String author, int numOfBooks) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.numOfBooks = numOfBooks;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
