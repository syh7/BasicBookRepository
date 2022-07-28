package syh.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import syh.model.Author;

/**
 * Repository for {@link Author}
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
