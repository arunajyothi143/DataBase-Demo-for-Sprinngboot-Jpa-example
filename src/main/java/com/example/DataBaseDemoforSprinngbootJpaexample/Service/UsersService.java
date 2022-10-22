package com.example.DataBaseDemoforSprinngbootJpaexample.Service;

import com.example.DataBaseDemoforSprinngbootJpaexample.Entity.User;
import com.example.DataBaseDemoforSprinngbootJpaexample.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;


    @PostConstruct
   public void initDB() {

        List<User> users = new ArrayList<>();
        users.add(new User(111, "dsfd", "it", 32));
        users.add(new User(121, "dsrd", "ieret", 32));
        users.add(new User(131, "dsd", "civil", 322));
        users.add(new User(141, "dsdc", "it", 312));
        users.add(new User(151, "dsdc", "iitt", 34));
        try {
            repository.saveAll(users);
        } catch (Exception ex)
        {
            ex.toString();
        }
    }
    public List<User> getUserDetails(){
        return repository.findAll();
    }

    public List<User> getUserByProfession(String profession){

        return  repository.findByProfession(profession);
    }


    public List<User> countUserByAge(int age){

     return repository.countByAge(age);

    }

    public List<User> deleteByName(String name){
        return repository.deleteByName(name);
    }
}
