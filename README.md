# Spring
## Урок 3. Использование Spring для разработки серверного приложения
### Базовое задание:
1) В класс RegistrationService добавить поля UserService, NotificationService(добавить в IOC контейнер аннотацией @Autowired или через конструктор класса)
2) Разработать метод processRegistration в котором:
   - создается пользователь из параметров метода
   - созданный пользователь добавляется в репозиторий
   - через notificationService выводится сообщение в консоль
3) В TaskController добавить обработчики filterUsersByAge()(Подсказка @GetMapping("/filter/{age}")) и calculateAverageAge (Подсказка @GetMapping("/calc"))
4) В методе filterUsersByAge параметр age получать через аннотацию @PathVariable

### Задание "со звездочкой":
1) В классе UserController добавить обработчик userAddFromParam извлекающий данные для создания пользователя из параметров HTTP запроса
   * http://localhost:9090/users/param?name=Fedor&age=25&email=aaaaa@yandex.ru
2) Перенести репозиторий проекта с List<User> на базу данных H2

### Проверка работы:
Для теcтирования проекта использовать программу PostMan:
1) Добавление пользователя - запрос :
   * метод - POST
   * адрес - http://localhost:8080/users/body
   * тело:
    ```json
    {
    "name":"Artur",
    "age":23,
    "email":"exam1@yandex.ru"
    }
    ```
2) Получение списка пользователей на сервере - запрос:
   * метод - GET
   * адрес - http://localhost:8080/users
3) Проверка сортировки - запрос:
   * метод - GET
   * адрес - http://localhost:8080/tasks/sort
4) Проверка фильтрации - запрос:
   * метод - GET
   * адрес - http://localhost:8080/tasks/filter/23
5) Проверка среднего арифметического - запрос:
   * метод - GET
   * адрес - http://localhost:8080/tasks/calc

[Решение](src/main/java/ru/geekbrain/example3sem3hometask/Example3sem3hometaskApplication.java)