package FootballScores.app.controllers;

import FootballScores.app.domain.Game;
import FootballScores.app.dto.GameDTO;
import FootballScores.app.repositories.GameRepository;
import FootballScores.app.repositories.TeamRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/games")
public class GameController {
	@Inject
	GameRepository repo;
	
	@Inject
	TeamRepository teamRepo;
	
	@Get("/")
	Iterable<Game> list(){
		return repo.findAll();
	}
	
	@Post("/")
	HttpResponse<Void> add(@Body GameDTO teamDetails){
		return null;
	}

}
