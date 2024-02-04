package ru.geekbrain.example3sem3hometask.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private int age;
    private String email;

}
