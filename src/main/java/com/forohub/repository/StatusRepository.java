package com.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.forohub.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
}
