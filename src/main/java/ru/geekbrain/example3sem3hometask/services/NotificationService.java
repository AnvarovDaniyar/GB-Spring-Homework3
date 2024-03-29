package ru.geekbrain.example3sem3hometask.services;

import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.User;

@Service
public class NotificationService {

    /**
     * Метод вывода в консоль успешного добавления пользователя
     * @param user Новый пользователь
     */
    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    /**
     * Метод составления сообщения успешного добавления пользователя
     * для передачи в ответ на запрос
     * @param user Новый пользователь
     * @return Строка успешного добавления пользователя
     */
    public String sendNotification(User user) {
        return "A new user has been created: " + user.getName();
    }
}
