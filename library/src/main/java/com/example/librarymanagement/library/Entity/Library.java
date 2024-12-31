package com.example.librarymanagement.library.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Library {

    public Library(){

    }

    public Library(int id, String name, String author, int numOfBooks, String uname, String pass) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.numOfBooks = numOfBooks;
        this.uname = uname;
        this.pass = pass;
    }

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String author;

    @Column
    private int numOfBooks;

    @Column(unique = true)
    private String uname;

    @Column
    private String pass;

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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
