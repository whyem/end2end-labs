package cl.whyem.app.backend.service;

import cl.whyem.app.backend.model.Author;
import cl.whyem.app.backend.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // assumes @ResponseBody annotation in methods annotated with  @RequestMapping
@RequestMapping(value = "/authors", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping
    public Iterable<Author> authors() {
        return authorRepository.findAll();
    }

}
