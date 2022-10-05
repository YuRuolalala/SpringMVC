package com;

import com.config.SpringConfig;
import com.pojo.Book;
import com.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)

public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book book = bookService.getById(15);
        System.out.println(book);
    }

    @Test
    public void getAll(){
        List<Book> bookList = bookService.getAll();
        System.out.println(bookList);
    }

    @Test
    public void update(){
        Book book=new Book(15,"计算机理论","java入门6666","java入门教学");
        bookService.update(book);
    }
    @Test
    public void testadd(){
        Book book=new Book(13,"计算机理论","java入门","java入门教学");
        bookService.save(book);
    }
}
