package servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * https://youtu.be/1jV338r0MDI https://www.gontu.org/
 * 
 * @author pavel
 *
 */
@SpringBootApplication
@ImportResource("classpath:spring.xml")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}