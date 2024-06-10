package com.github.daniellimadev.springbootjpa.repositories;

import com.github.daniellimadev.springbootjpa.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {
}
