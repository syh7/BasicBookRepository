package syh.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import syh.model.Book;

/**
 * Repository for {@link Book}
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
