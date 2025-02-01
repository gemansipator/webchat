package site.javadev.webchat.controller;

// Импортируем необходимые классы и аннотации из Spring и других библиотек
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.javadev.webchat.dto.UserDto;
import site.javadev.webchat.repository.UserRepository;

import java.util.List;

// Аннотация @RestController указывает, что этот класс является контроллером Spring и обрабатывает HTTP-запросы
@RestController
// Определяет базовый URL-адрес для всех методов этого контроллера
@RequestMapping("/users")
// Аннотация @RequiredArgsConstructor автоматически генерирует конструктор с необходимыми зависимостями
@RequiredArgsConstructor
public class UserConroller { // Ошибка в названии класса, должно быть UserController

    // Репозиторий для работы с пользователями
    private final UserRepository userRepository;

    // Метод, который обрабатывает GET-запрос по пути "/users"
    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {
        // Создаем тестового пользователя (захардкоженные данные)
        UserDto userDto = new UserDto(1, "Jonn", "Doe@gmai.com");

        // Возвращаем список пользователей в формате JSON с HTTP-статусом 200 (OK)
        return ResponseEntity.ok(List.of(userDto));
    }
}
