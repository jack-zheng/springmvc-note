package com.jzheng.service;

import com.jzheng.pojo.Books;
import org.apache.ibatis.annotations.Param;

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

    List<Books> queryBookByName(@Param("bookName")String bookName);
}
