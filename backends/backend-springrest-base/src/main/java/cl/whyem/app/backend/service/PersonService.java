package cl.whyem.app.backend.service;

import cl.whyem.app.backend.model.Person;
import cl.whyem.app.backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // assumes @ResponseBody annotation in methods annotated with  @RequestMapping
@RequestMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping
    public Iterable<Person> persons() {
        return personRepository.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Person personById(@PathVariable("id") Long id) {
        return personRepository.findOne(id);
    }


}
