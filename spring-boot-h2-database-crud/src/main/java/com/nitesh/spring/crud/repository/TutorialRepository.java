package com.nitesh.spring.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitesh.spring.crud.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContainingIgnoreCase(String title);
}
