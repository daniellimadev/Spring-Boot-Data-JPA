package com.github.daniellimadev.springbootjpa.dtos;

import java.util.Set;

public record BookRecordDto(String title,
                            Long publisherId,
                            Set<Long> authorIds,
                            String reviewComment) {
}