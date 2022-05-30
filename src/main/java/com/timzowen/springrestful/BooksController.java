package com.timzowen.springrestful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(
                new Book(1,"Timz Owen","Code with Timz Owen"),
                new Book(2,"Timz","Introduction to Python"));
    }

}
