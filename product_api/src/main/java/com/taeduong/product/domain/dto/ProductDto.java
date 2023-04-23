package com.taeduong.product.domain.dto;

import com.taeduong.product.domain.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link com.taeduong.product.domain.model.Product} entity
 */
@Data
@AllArgsConstructor
public class ProductDto implements Serializable {
    private final Long id;
    private final String createBy;
    private final Instant createDate;
    private final String modifiedBy;
    private final Instant modifiedDate;
    private final String description;
    private final Byte available;
    private final String name;
    private final BigDecimal price;
    private final Integer quantity;
    private final String size;
    private final String image;
    private final Integer quantitySold;
    private final Boolean status;
}