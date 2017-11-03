package com.zhai.book.service;

import com.zhai.book.dao.BookDao;
import com.zhai.book.domin.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/10/31.
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public Book selectBookById(int bookId){
        System.out.println("BookService=");
            return bookDao.selectBookById(bookId);
    }
}
