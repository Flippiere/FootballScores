package FootballScores.app.controllers;

import java.net.URI;
import java.util.Optional;

import FootballScores.app.domain.Team;
import FootballScores.app.dto.TeamDTO;
import FootballScores.app.repositories.TeamRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/teams")
public class TeamController {
	@Inject
	TeamRepository repo;
	
	@Get("/")
	Iterable<Team> list(){
		return repo.findAll();
	}
	
	@Get("/{id}")
	Optional<Team> get(Long id){
		return repo.findById(id);
	}
	
	
	@Post("/")
	HttpResponse<Void> add(@Body TeamDTO teamDetails){
		if(teamDetails.getName().isEmpty()){
			return HttpResponse.notAllowed();
		}
		Team team = new Team();
		team.setName(teamDetails.getName());
		repo.save(team);
		return HttpResponse.created(URI.create("/teams/" + team.getId()));
	}
}
