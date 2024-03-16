package com.lazarev.owllibrary.service;

import com.lazarev.owllibrary.data.BooksEntity;
import com.lazarev.owllibrary.data.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BooksService {

    private final BookRepository bookRepository;

    @Autowired
    public BooksService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BooksEntity> getAllBook() {
        return bookRepository.findAll();
    }

    public List<BooksEntity> findBookId(List<Integer> id) {
        return bookRepository.findAllById(id);
    }

    public List<BooksEntity> insertBook(BooksEntity bookInfo) {
        bookRepository.save(bookInfo);
        return bookRepository.findAll();

    }

}
