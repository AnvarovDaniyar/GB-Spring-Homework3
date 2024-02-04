package ru.geekbrain.example3sem3hometask.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrain.example3sem3hometask.domain.User;
import ru.geekbrain.example3sem3hometask.services.RegistrationService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private RegistrationService service;

    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getRepository().getUsers();
    }

    @PostMapping("/body")//localhost:8080/users/body
    public String userAddFromBody(@RequestBody User user) {
        service.getDataProcessingService().getRepository().getUsers().add(user);
        service.getNotificationService().notifyUser(user);
        return service.getNotificationService().sendNotification(user);
    }

    @PostMapping("/param")//localhost:8080/users/param?name=Artur&age=23&email=exam1@yandex.ru
    @ResponseBody
    public String userAddFromParam(
            @RequestParam("name") String name
            , @RequestParam("age") int age
            , @RequestParam("email") String email) {
        return service.processRegistration(name, age, email);
    }
}
