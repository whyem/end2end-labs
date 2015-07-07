package cl.whyem.app.backend.repository;

import cl.whyem.app.backend.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>{
}
