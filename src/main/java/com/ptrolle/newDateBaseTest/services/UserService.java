package com.ptrolle.newDateBaseTest.services;

import com.ptrolle.newDateBaseTest.entities.User;
import com.ptrolle.newDateBaseTest.repositories.UserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get(); //obj.get vai retornar o objeto do tipo User
    }
}
