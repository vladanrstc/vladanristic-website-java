package com.example.demo.repository;

import com.example.demo.entities.Answer;
import com.example.demo.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository  extends JpaRepository<Answer, Long> {
}