package com.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forohub.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
