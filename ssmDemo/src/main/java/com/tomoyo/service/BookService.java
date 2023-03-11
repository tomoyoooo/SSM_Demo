package com.tomoyo.service;

import com.tomoyo.pojo.Books;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询所有书
    List<Books> queryAllBook();
    //根据id查询,返回一个Book
    Books queryBookByName(String bookName);
}
