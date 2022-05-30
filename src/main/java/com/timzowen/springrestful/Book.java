package com.timzowen.springrestful;

public class Book {
    long id;
    String name;
    String author;

    // Create constructor
    public Book(long id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // getters
    public long getId(){
        return  id;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
}
