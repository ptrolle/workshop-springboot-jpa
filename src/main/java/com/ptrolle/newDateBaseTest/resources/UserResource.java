package com.ptrolle.newDateBaseTest.resources;

import com.ptrolle.newDateBaseTest.entities.User;
import com.ptrolle.newDateBaseTest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    //metodo end point para acessar usuarios
    //consigo puxar esses usuarios no http:localhost:8080/users
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list =service.findAll();
        //User u = new User(1L , "Maria", "maria@gmail.com", "999999999", "12345"); //de forma manual

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
