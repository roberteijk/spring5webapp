package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
