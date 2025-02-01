package site.javadev.webchat.repository;

import org.springframework.data.repository.CrudRepository;
import site.javadev.webchat.entity.UserEntity;

public interface UserRepository  extends CrudRepository<UserEntity, Integer> {

}
