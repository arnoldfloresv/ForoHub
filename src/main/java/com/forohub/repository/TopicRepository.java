package com.forohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.forohub.model.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
}
