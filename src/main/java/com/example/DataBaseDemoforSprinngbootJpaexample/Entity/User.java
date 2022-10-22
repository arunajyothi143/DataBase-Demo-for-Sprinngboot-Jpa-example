package com.example.DataBaseDemoforSprinngbootJpaexample.Entity;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name = "Users_Table")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    private int id;
    private String name;
    private String profession;
    private int age;

}
