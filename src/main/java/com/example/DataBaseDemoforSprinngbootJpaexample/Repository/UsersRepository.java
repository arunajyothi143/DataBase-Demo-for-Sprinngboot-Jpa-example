package com.example.DataBaseDemoforSprinngbootJpaexample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.DataBaseDemoforSprinngbootJpaexample.Entity.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User,Integer> {

    public List<User> findByProfession(String profession);

    public List<User> countByAge(int age);

    public List<User>  deleteByName(String name);

}
