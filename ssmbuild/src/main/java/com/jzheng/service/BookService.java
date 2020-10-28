package com.jzheng.service;

import com.jzheng.pojo.Books;

import java.util.List;

public interface BookService {
    // add
    int addBook(Books books);

    // delete
    int deleteBookById(int id);

    // update
    int updateBook(Books books);

    // query
    Books queryBookById(int id);

    // queryAll
    List<Books> queryAllBooks();
}
