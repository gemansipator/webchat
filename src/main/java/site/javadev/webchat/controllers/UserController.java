package site.javadev.webchat.controllers;

// Импортируем необходимые классы и аннотации из Spring и других библиотек
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Пользователи", description = "API для управления пользователями")
// Аннотация @RequiredArgsConstructor автоматически генерирует конструктор с необходимыми зависимостями
@RequiredArgsConstructor
public class UserController {

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
