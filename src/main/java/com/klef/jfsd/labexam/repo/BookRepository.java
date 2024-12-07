package com.klef.jfsd.labexam.repo;

import com.klef.jfsd.labexam.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
