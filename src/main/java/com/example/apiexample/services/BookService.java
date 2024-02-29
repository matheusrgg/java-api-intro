package com.example.apiexample.services;


import com.example.apiexample.domain.Book;
import com.example.apiexample.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookClient bookClient;

    public BookService(BookClient client){
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary(){
    return  this.bookClient.getBooks();
    }
}
