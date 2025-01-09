package com.mdc.gatekeeper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name="authorities")
public class AuthorityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="authority_id")
    private int authorityId;

    @Column(name = "authority")
    private String authority;

    @ManyToMany(mappedBy = "authorities")
    List<RoleEntity> roles;
}
