package com.taeduong.product.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.taeduong.product.domain.model.Category} entity
 */
@Data
public class CategoryDto implements Serializable {
    private final Long id;
    private final String createBy;
    private final Instant createDate;
    private final String modifiedBy;
    private final Instant modifiedDate;
    private final String code;
    private final String name;
    private final Byte status;
}