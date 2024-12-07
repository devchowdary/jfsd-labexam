package com.klef.jfsd.labexam.controller;

import com.klef.jfsd.labexam.model.Book;
import com.klef.jfsd.labexam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PutMapping("/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book updatedBook) {
        Optional<Book> updated = bookService.updateBook(id, updatedBook);
        return updated.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
