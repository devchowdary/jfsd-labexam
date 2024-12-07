package com.klef.jfsd.labexam.service;



import com.klef.jfsd.labexam.model.Book;
import com.klef.jfsd.labexam.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Optional<Book> updateBook(Integer id, Book updatedBook) {
        return bookRepository.findById(id).map(existingBook -> {
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setGenre(updatedBook.getGenre());
            existingBook.setPrice(updatedBook.getPrice());
            existingBook.setPublishedYear(updatedBook.getPublishedYear());
            return bookRepository.save(existingBook);
        });
    }
}
