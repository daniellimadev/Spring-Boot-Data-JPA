package com.github.daniellimadev.springbootjpa.repositories;

import com.github.daniellimadev.springbootjpa.models.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
