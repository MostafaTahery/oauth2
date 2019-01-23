package co.nilin.security.oauth2;

import co.nilin.security.oauth2.data.entity.User;
import co.nilin.security.oauth2.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Oauth2Application {


	public static void main(String[] args) {
		SpringApplication.run(Oauth2Application.class, args);

	}

}

