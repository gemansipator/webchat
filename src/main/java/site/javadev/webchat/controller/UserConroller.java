package site.javadev.webchat.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.javadev.webchat.dto.UserDto;
import site.javadev.webchat.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserConroller {

    private final UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {
        UserDto userDto = new UserDto(1,"Jonn","Doe@gmai.com");
        return ResponseEntity.ok(List.of(userDto));
    }
}
