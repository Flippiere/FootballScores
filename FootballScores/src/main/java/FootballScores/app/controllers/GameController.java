package FootballScores.app.controllers;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;

import FootballScores.app.domain.Game;
import FootballScores.app.domain.Team;
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
	HttpResponse<Void> add(@Body GameDTO gameDetails){
		Optional<Team> team1o = teamRepo.findById(gameDetails.getTeam1Id());
		Optional<Team> team2o = teamRepo.findById(gameDetails.getTeam2Id());
		if(team1o.isEmpty() || team2o.isEmpty()){
			return HttpResponse.badRequest();
		}
		Team team1 = team1o.get();
		Team team2 = team2o.get();
		Game game = new Game();
		game.setTeam1(team1);
		game.setTeam2(team2);
		game.setTime(LocalDateTime.now());
		repo.save(game);
		return HttpResponse.created(URI.create("/games/" + game.getId()));
	}
}
