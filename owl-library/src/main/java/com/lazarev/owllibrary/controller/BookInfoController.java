package com.lazarev.owllibrary.controller;


import com.lazarev.owllibrary.data.BooksEntity;
import com.lazarev.owllibrary.exception.IllegalBookId;
import com.lazarev.owllibrary.service.BooksService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class BookInfoController {

    private final BooksService booksService;

    @Autowired
    public BookInfoController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/book-info/all")
    @Operation(summary = "Получить все книги")
    public List<BooksEntity> getInfoAllBook() {
        return booksService.getAllBook();
    }

    @GetMapping("/book-info/{id}")
    @Operation(summary = "Получить инфо о книге по id")
    public List<BooksEntity> getInfoBook(@PathVariable Integer id) {
        List<Integer> ids = Collections.singletonList(id);
        List<BooksEntity> listIds = booksService.findBookId(ids);
        if (listIds.isEmpty()) {
            throw new IllegalBookId("Not found book_id");
        } else {
            return listIds;
        }
    }

    @PostMapping("/add-book")
    @Operation(summary = "Добавить книгу в библиотеку")
    @ResponseStatus(HttpStatus.CREATED)
    public List<BooksEntity> postBook(@RequestBody BooksEntity book) {
        return booksService.insertBook(book);
    }

}
