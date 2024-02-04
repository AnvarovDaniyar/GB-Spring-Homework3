package ru.geekbrain.example3sem3hometask.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.User;

@AllArgsConstructor
@Service
public class UserService {

    private NotificationService notificationService;

    /**
     * Метод создания нового пользователя
     * @param name Имя
     * @param age Возраст
     * @param email E-mail
     * @return Новый пользователь
     */
    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        // Отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);

        return user;
    }
}
