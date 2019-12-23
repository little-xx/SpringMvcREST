package com.littlexx.SpringMvcREST.web;

import com.littlexx.SpringMvcREST.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    @RequestMapping("/book")
    public String Book() {
        return "book";
    }

    @RequestMapping("/book1")
    public String buyBook(Book book) {
        System.out.println("我要购买的图书:" + book);
        return "success";
    }
}
