package cl.whyem.app.backend.service;

import cl.whyem.app.backend.model.Book;
import cl.whyem.app.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // assumes @ResponseBody annotation in methods annotated with  @RequestMapping
@RequestMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping
    public Iterable<Book> books() {
        return bookRepository.findAll();
    }


}
