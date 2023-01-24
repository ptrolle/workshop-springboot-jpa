package com.ptrolle.newDateBaseTest.resources;

import com.ptrolle.newDateBaseTest.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    //metodo end point para acessar usuarios
    //consigo puxar esses usuarios no http:localhost:8080/users
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L , "Maria", "maria@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
