package site.javadev.webchat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import site.javadev.webchat.entity.UserEntity;

// Интерфейс UserRepository расширяет CrudRepository, что позволяет работать с сущностью UserEntity
// CrudRepository предоставляет базовые CRUD операции (создание, чтение, обновление, удаление)
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
