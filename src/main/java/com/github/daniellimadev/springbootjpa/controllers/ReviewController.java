package com.github.daniellimadev.springbootjpa.controllers;

import com.github.daniellimadev.springbootjpa.dtos.ReviewRecordDto;
import com.github.daniellimadev.springbootjpa.models.ReviewModel;
import com.github.daniellimadev.springbootjpa.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public ResponseEntity<List<ReviewModel>> getAllReviews() {
        return ResponseEntity.status(HttpStatus.OK).body(reviewService.getAllReviews());
    }
}
