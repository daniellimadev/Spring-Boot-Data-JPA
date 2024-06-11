package com.github.daniellimadev.springbootjpa.service;

import com.github.daniellimadev.springbootjpa.dtos.PublisherRecordDto;
import com.github.daniellimadev.springbootjpa.models.PublisherModel;
import com.github.daniellimadev.springbootjpa.repositories.PublisherRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<PublisherModel> getAllPublishers() {
        return publisherRepository.findAll();
    }

    @Transactional
    public PublisherModel savePublisher(PublisherRecordDto publisherRecordDto) {
        PublisherModel publisher = new PublisherModel();
        publisher.setName(publisherRecordDto.name());
        return publisherRepository.save(publisher);
    }
}

