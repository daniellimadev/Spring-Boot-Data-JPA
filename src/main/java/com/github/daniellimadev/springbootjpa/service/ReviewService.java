package com.github.daniellimadev.springbootjpa.service;

import com.github.daniellimadev.springbootjpa.models.ReviewModel;
import com.github.daniellimadev.springbootjpa.repositories.BookRepository;
import com.github.daniellimadev.springbootjpa.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;

    public ReviewService(ReviewRepository reviewRepository, BookRepository bookRepository) {
        this.reviewRepository = reviewRepository;
        this.bookRepository = bookRepository;
    }

    public List<ReviewModel> getAllReviews() {
        return reviewRepository.findAll();
    }

}
