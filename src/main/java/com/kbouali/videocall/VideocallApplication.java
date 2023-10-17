package com.kbouali.videocall;

import com.kbouali.videocall.user.User;
import com.kbouali.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service) {
		return args -> {
			service.register(
					User.builder()
							.username("Khalil")
							.email("khalil@mail.com")
							.password("1234")
							.build()
			);
			service.register(
					User.builder()
							.username("Nassim")
							.email("nassim@mail.com")
							.password("1234")
							.build()
			);
			service.register(
					User.builder()
							.username("Selman")
							.email("selman@mail.com")
							.password("1234")
							.build()
			);
		};
	}

}
