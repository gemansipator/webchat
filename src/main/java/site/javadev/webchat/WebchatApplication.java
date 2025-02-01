package site.javadev.webchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

// Аннотация @SpringBootApplication указывает, что это основной класс приложения Spring Boot
@SpringBootApplication
public class WebchatApplication {

    // Метод main запускает Spring Boot приложение
    public static void main(String[] args) {
        SpringApplication.run(WebchatApplication.class, args);
    }

    // Аннотация @Bean указывает, что метод создает и возвращает объект, который будет
    // управляться контейнером Spring
    @Bean
    // Аннотация @ConfigurationProperties связывает свойства из
    // конфигурации (например, application.properties) с объектом DataSource
    @ConfigurationProperties("spring.datasource")
    // Метод dataSource создает и настраивает объект DataSource, который используется
    // для подключения к базе данных
    public DataSource dataSource() {
        // DataSourceBuilder используется для создания и настройки источника данных
        return DataSourceBuilder.create().build();
    }
}
