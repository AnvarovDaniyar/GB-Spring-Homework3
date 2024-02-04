package ru.geekbrain.example3sem3hometask.services;

import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.User;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public String sendNotification(User user) {
        return "A new user has been created: " + user.getName();
    }
}
