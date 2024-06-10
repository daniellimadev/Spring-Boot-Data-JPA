package com.github.daniellimadev.springbootjpa.dtos;

import java.util.UUID;

public record ReviewRecordDto(String comment, UUID bookId) {
}
