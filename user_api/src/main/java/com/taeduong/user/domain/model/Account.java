package com.taeduong.user.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Instant createDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "dob")
    private Instant dob;

    @Column(name = "email")
    private String email;

    @Column(name = "fullname", length = 100)
    private String fullname;

    @Column(name = "gender")
    private Byte gender;

    @Column(name = "password", nullable = false, length = 130)
    private String password;

    @Column(name = "phone_number", length = 12)
    private String phoneNumber;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "username", nullable = false, length = 20)
    private String username;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name="account_role",
            joinColumns= @JoinColumn(name="account_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private Set<Role> roles = new HashSet<>();

}