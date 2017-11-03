package com.zhai.book.dao;

import com.zhai.book.domin.Book;

/**
 * Created by admin on 2017/10/31.
 */
public interface BookDao {
    public Book selectBookById(Integer bookId);
}
