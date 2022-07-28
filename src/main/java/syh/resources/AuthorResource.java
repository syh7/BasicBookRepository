package syh.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import syh.dtos.AuthorDTO;
import syh.model.Book;
import syh.services.AuthorService;

import java.util.List;

/**
 * Resource for {@link Book}
 */
@RestController
@RequestMapping("authors")
public class AuthorResource {

    @Autowired
    AuthorService authorService;


    @GetMapping("all")
    public List<AuthorDTO> getAllAuthors() {
        return authorService.getAllAuthors();
    }
}
