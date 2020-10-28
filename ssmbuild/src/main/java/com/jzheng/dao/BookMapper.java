package com.jzheng.dao;

import com.jzheng.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    // add
    int addBook(Books books);

    // delete
    int deleteBookById(@Param("bookId") int id);

    // update
    int updateBook(Books books);

    // query
    Books queryBookById(int id);

    // queryAll
    List<Books> queryAllBooks();
}
