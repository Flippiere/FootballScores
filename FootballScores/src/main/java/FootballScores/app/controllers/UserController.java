package FootballScores.app.controllers;

import FootballScores.app.domain.User;
import FootballScores.app.repositories.UserRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/users")
public class UserController {
	@Inject
	UserRepository repo;
	
	@Get("/")
	Iterable<User> list(){
		return repo.findAll();
	}

}
