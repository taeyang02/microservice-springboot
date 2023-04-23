package com.taeduong.user.domain.dto;

import com.taeduong.user.domain.model.Role;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * A DTO for the {@link com.taeduong.user.domain.model.Account} entity
 */
@Data
public class AccountDto implements Serializable {
    private final Long id;
    private final String createBy;
    private final Instant createDate;
    private final String modifiedBy;
    private final Instant modifiedDate;
    private final String address;
    private final Instant dob;
    private final String email;
    private final String fullname;
    private final Byte gender;
    private final String password;
    private final String phoneNumber;
    private final Boolean status;
    private final String username;
    private final List<Role> roles;
}