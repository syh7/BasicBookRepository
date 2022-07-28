package syh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import syh.model.Author;
import syh.model.Book;
import syh.repositories.BookRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository bookRepository) {
        return (args) -> {
            Book book1 = Book.builder().isbn("isbn 1").title("title 1").build();
            Book book2 = Book.builder().isbn("isbn 2").title("title 2").build();
            Book book3 = Book.builder().isbn("isbn 3").title("title 3").build();

            Author author1 = Author.builder()
                    .firstName("first 1")
                    .lastName("last 1")
                    .dateOfBirth(LocalDate.now())
                    .books(Arrays.asList(book1, book2))
                    .build();
            Author author2 = Author.builder()
                    .firstName("first 2")
                    .lastName("last 2")
                    .dateOfBirth(LocalDate.now())
                    .books(Collections.singletonList(book3)).build();

            book1.setAuthor(author1);
            book2.setAuthor(author1);
            book3.setAuthor(author2);

            bookRepository.save(book1);
            bookRepository.save(book2);
            bookRepository.save(book3);
        };
    }

}
