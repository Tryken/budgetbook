package com.example.budgetbook.user.domain.persistence;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {

    Iterable<UserEntity> findAll(Pageable pageable);
}
