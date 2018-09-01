package com.example.todoapp.controllers;

import javax.validation.Valid;
import com.example.todoapp.models.User;
import com.example.todoapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserRepository UserRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        return UserRepository.findAll(sortByCreatedAtDesc);
    }
    
    
    @GetMapping("/findUser/{username}/{password}")
    public String findUser(@PathVariable(value="username") String username,@PathVariable(value="password")String password) {
        String test="false";
    	List<User> users=UserRepository.findAll();
        for(User ls:users) {
        	if((ls.getUsername().equals(username))&&(ls.getPassword().equals(password))){
        		test="true";
        	}
        }
        return test;
    }
    

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User User) {
        
        return UserRepository.save(User);
    }

    @GetMapping(value="/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
        return UserRepository.findById(id)
                .map(User -> ResponseEntity.ok().body(User))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String id,
                                           @Valid @RequestBody User User) {
        return UserRepository.findById(id)
                .map(UserData -> {
                   
                    UserData.setFirstName(User.getFirstName());
                    UserData.setLastName(User.getLastName());
                    UserData.setPassword(User.getPassword());
                    UserData.setUsername(User.getUsername());
                    User updatedUser = UserRepository.save(UserData);
                    return ResponseEntity.ok().body(updatedUser);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value="/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") String id) {
        return UserRepository.findById(id)
                .map(User -> {
                    UserRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}