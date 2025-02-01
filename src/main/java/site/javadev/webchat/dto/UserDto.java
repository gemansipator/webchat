package site.javadev.webchat.dto;

// Импортируем аннотации Lombok для автоматической генерации геттеров и сеттеров
import lombok.Getter;
import lombok.Setter;

// Аннотации Lombok, которые автоматически создают методы get и set для всех полей
@Setter
@Getter
public class UserDto {
    // Уникальный идентификатор пользователя
    private int id;

    // Имя пользователя
    private String name;

    // Email пользователя
    private String email;

    // Конструктор для инициализации объекта UserDto
    public UserDto(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
