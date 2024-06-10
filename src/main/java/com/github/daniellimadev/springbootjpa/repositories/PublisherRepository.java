package com.github.daniellimadev.springbootjpa.repositories;

import com.github.daniellimadev.springbootjpa.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
