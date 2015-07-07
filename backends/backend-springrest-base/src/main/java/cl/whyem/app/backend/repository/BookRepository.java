package cl.whyem.app.backend.repository;

import cl.whyem.app.backend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
