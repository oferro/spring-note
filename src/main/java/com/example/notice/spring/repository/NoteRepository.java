package com.example.notice.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.notice.spring.model.Note;


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
