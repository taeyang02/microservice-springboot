package com.taeduong.user.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.taeduong.user.domain.model.Role} entity
 */
@Data
public class RoleDto implements Serializable {
    private Long id;
    private String createBy;
    private Instant createDate;
    private String modifiedBy;
    private Instant modifiedDate;
    private String name;
}