package syh.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import syh.model.Book;
import syh.services.BookService;

import java.util.List;

/**
 * Resource for {@link Book}
 */
@RestController
public class BookResource {

    @Autowired
    BookService bookService;


    @GetMapping("/books/all")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }
}
