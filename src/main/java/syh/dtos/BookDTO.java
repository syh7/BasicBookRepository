package syh.dtos;

import lombok.Data;
import syh.model.Book;

@Data
public class BookDTO {

    private String title;
    private String isbn;
    private String author;

    public BookDTO(Book book) {
        title = book.getTitle();
        isbn = book.getIsbn();
        author = book.getAuthor().getName();
    }

}
