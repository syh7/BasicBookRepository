package syh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import syh.dtos.AuthorDTO;
import syh.model.Author;
import syh.repositories.AuthorRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public List<AuthorDTO> getAllAuthors() {
        List<Author> authors = (List<Author>) authorRepository.findAll();
        return authors.stream().map(AuthorDTO::new).collect(Collectors.toList());
    }

}
