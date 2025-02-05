package site.javadev.webchat.entity;

import jakarta.persistence.*;

// Аннотация @Entity указывает, что этот класс является сущностью JPA
@Entity
// Аннотация @Table указывает, что эта сущность соответствует таблице "user" в базе данных
@Table(name = "user")
public class UserEntity {

    // Аннотация @Id указывает, что это поле является уникальным идентификатором сущности
    @Id
    // Аннотация @GeneratedValue с параметром strategy = GenerationType.IDENTITY означает, что значение поля будет генерироваться базой данных автоматически
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Аннотация @Column указывает, что это поле соответствует колонке с именем "name" в таблице
    @Column(name = "name")
    private String name;

    // Аннотация @Column указывает, что это поле соответствует колонке с именем "email" в таблице
    @Column(name = "email")
    private String email;

}
