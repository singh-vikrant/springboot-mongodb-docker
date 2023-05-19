package singh.vikrant.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import singh.vikrant.starter.dao.BookRepo;
import singh.vikrant.starter.model.Book;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @PostMapping("saveBook")
    public Book saveBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }
    @GetMapping("getAllBooks")
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
