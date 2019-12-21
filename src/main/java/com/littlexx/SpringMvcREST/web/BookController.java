package com.littlexx.SpringMvcREST.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    @RequestMapping(value = "book/{bookID}", method = RequestMethod.GET)
    public String getBook(@PathVariable("bookID") Integer id) {
        System.out.println("get Book ID:" + id);
        return "bookStores";
    }

    @RequestMapping(value = "book/{bookID}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable("bookID") Integer id) {
        System.out.println("update Book ID:" + id);
        return "bookStores";
    }

    @RequestMapping(value = "book/{bookID}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("bookID") Integer id) {
        System.out.println("delete Book ID:" + id);
        return "bookStores";
    }

    @RequestMapping(value = "book/{bookID}", method = RequestMethod.POST)
    public String addBook(@PathVariable("bookID") Integer id) {
        System.out.println("add Book ID:" + id);
        return "bookStores";
    }
}
