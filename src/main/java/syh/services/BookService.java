package syh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import syh.dtos.BookDTO;
import syh.model.Book;
import syh.repositories.BookRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<BookDTO> getAllBooks() {
        List<Book> books = (List<Book>) bookRepository.findAll();
        return books.stream().map(BookDTO::new).collect(Collectors.toList());
    }

}
