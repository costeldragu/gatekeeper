package com.mdc.gatekeeper.repositories;

import com.mdc.gatekeeper.entity.AuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Integer> {
}
