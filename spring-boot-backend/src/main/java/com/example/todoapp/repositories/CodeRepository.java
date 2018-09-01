package com.example.todoapp.repositories;

import com.example.todoapp.models.Code;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepository extends MongoRepository<Code, String> {

List<Code> findByUsername(String username);

}