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
    private Long id;
    private String createBy;
    private Instant createDate;
    private String modifiedBy;
    private Instant modifiedDate;
    private String address;
    private Instant dob;
    private String email;
    private String fullname;
    private Byte gender;
    private String password;
    private String phoneNumber;
    private Boolean status;
    private String username;
    private List<Role> roles;
}