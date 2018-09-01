package com.example.todoapp.controllers;

import javax.validation.Valid;
import com.example.todoapp.models.Code;
import com.example.todoapp.repositories.CodeRepository;
import com.example.todoapp.models.Code;
import com.example.todoapp.repositories.CodeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CodeController {

    @Autowired
    CodeRepository codeRepository;

    @GetMapping("/codes")
    public List<Code> getAllcodes() {
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        return codeRepository.findAll(sortByCreatedAtDesc);
    }

    @PostMapping("/codes")
    public Code createcode(@Valid @RequestBody Code code) {
        
        
        return codeRepository.save(code);
    }

    
    @GetMapping(value="/codes/{username}")
    public List<Code> getcodeByUsername(@PathVariable("username") String username) {
        return codeRepository.findByUsername(username);
    }

    @PutMapping(value="/codes/{id}")
    public ResponseEntity<Code> updatecode(@PathVariable("id") String id,
                                           @Valid @RequestBody Code code) {
        return codeRepository.findById(id)
                .map(codeData -> {
                    codeData.setResult(code.getResult());
                    codeData.setUsername(code.getUsername());
                    Code updatedcode = codeRepository.save(codeData);
                    return ResponseEntity.ok().body(updatedcode);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value="/codes/{id}")
    public ResponseEntity<?> deletecode(@PathVariable("id") String id) {
        return codeRepository.findById(id)
                .map(code -> {
                    codeRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}