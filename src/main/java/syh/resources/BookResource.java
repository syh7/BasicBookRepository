package syh.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import syh.dtos.BookDTO;
import syh.model.Book;
import syh.services.BookService;

import java.util.List;

/**
 * Resource for {@link Book}
 */
@RestController
@RequestMapping("books")
public class BookResource {

    @Autowired
    BookService bookService;


    @GetMapping("all")
    public List<BookDTO> getBooks() {
        return bookService.getAllBooks();
    }
}
