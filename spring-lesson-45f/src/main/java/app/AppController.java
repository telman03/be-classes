package app;


import app.model.ui.Book;
import app.repo.AuthorRepo;
import app.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("ab")
public class AppController {
    private final BookRepo bookRepo;
    private final AuthorRepo authorRepo;


    // http://localhost:8081/ab/books1
    @GetMapping("books1")
    public List<app.model.db.Book> handle1() {
        List<app.model.db.Book> books = bookRepo.findAll();
        return books;
    }

    // http://localhost:8081/ab/books

    @GetMapping("books")
    public List<app.model.ui.Book> handle2(){
        List<app.model.db.Book> books = bookRepo.findAll();
        return books.stream()
                .map(book ->
                        new app.model.ui.Book(
                                book.getId(), book.getTitle(), book.getAuthors()
                                .stream().map(
                                        a -> new app.model.ui.Author(
                                                a.getId(), a.getName()
                                        )).collect(Collectors.toSet()
                                )
                        )
                )
                .collect(Collectors.toList());

    }

}
