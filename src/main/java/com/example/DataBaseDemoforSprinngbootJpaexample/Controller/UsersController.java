package com.example.DataBaseDemoforSprinngbootJpaexample.Controller;


import com.example.DataBaseDemoforSprinngbootJpaexample.Entity.User;
import com.example.DataBaseDemoforSprinngbootJpaexample.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/get-all-entity-details")
public class UsersController {
    @Autowired
    private UsersService service;

    @GetMapping("/getUsers")
    public List<User> getAllUsers(){

        return service.getUserDetails();
    }

    @GetMapping("/getUser-By-Profession/{profession}")

    public List<User> getUserByProffesion(@PathVariable String profession){

        return service.getUserByProfession(profession);
    }

    @GetMapping("/getusers-Count-ByAge/{age}")

    public String getCountByAge(@PathVariable int age){

        List<User> count = service.countUserByAge(age);
        return "No.of user :" + count;
    }

    @DeleteMapping("/delete-By-Name/{name}")

    public List<User> deleteUser(@PathVariable String name){

        return service.deleteByName(name);
    }

}
