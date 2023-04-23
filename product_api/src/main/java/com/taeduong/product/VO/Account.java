package com.taeduong.product.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
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
}