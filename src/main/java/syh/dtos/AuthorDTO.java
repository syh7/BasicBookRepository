package syh.dtos;

import lombok.Data;
import syh.model.Author;
import syh.model.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class AuthorDTO {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private List<String> books;

    public AuthorDTO(Author author) {
        firstName = author.getFirstName();
        lastName = author.getLastName();
        dateOfBirth = author.getDateOfBirth();
        books = author.getBooks().stream().map(Book::getTitle).collect(Collectors.toList());
    }

}
