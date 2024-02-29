package com.example.apiexample.feign;

import com.example.apiexample.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-api", url="https://book-example-api.s3.amazonaws.com")
public interface BookClient  {
    @GetMapping("/books.json")
    List<Book> getBooks();
}
