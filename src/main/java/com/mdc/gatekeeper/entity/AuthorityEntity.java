package com.mdc.gatekeeper.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlID;

@Entity
@Getter
@Setter
public class AuthorityEntity {
    @Id
    @GeneratedValue
    private int authorityId;
    private String authority;
}
