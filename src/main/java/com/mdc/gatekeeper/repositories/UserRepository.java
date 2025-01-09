package com.mdc.gatekeeper.repositories;

import com.mdc.gatekeeper.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
