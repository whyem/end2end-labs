package cl.whyem.app.backend.repository;

import cl.whyem.app.backend.model.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Empty JpaRepository is enough for a simple crud.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    /* A version to fetch List instead of Page to avoid extra count query. */
    List<Person> findAllBy(Pageable pageable);
}