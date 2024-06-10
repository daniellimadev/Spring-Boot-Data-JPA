package com.github.daniellimadev.springbootjpa.repositories;

import com.github.daniellimadev.springbootjpa.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<BookModel, UUID> {
}
