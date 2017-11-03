package com.zhai.book.service;

import com.zhai.book.baseTest.SpringTestCase;
import com.zhai.book.domin.Book;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by admin on 2017/10/31.
 */
public class BookServiceTest extends SpringTestCase {
    @Autowired
    private BookService bookService;
    Logger logger = Logger.getLogger(BookServiceTest.class);

    @Test
    public void selectUserByIdTest(){
        Book book  = bookService.selectBookById(2);
        System.out.println("查找结果" + book.getName() + "===" + book.getRecommend());
    }


}
