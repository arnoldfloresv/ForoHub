package com.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.forohub.model.Response;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {
}
