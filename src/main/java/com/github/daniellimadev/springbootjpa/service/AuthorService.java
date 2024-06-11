package com.github.daniellimadev.springbootjpa.service;

import com.github.daniellimadev.springbootjpa.dtos.AuthorRecordDto;
import com.github.daniellimadev.springbootjpa.models.AuthorModel;
import com.github.daniellimadev.springbootjpa.repositories.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorModel> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Transactional
    public AuthorModel saveAuthor(AuthorRecordDto authorRecordDto) {
        AuthorModel author = new AuthorModel();
        author.setName(authorRecordDto.name());
        return authorRepository.save(author);
    }
}
