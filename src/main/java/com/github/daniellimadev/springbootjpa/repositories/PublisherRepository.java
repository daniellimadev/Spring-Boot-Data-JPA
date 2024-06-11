package com.github.daniellimadev.springbootjpa.repositories;

import com.github.daniellimadev.springbootjpa.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherModel, Long> {
}
