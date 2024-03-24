package FootballScores.app.controllers;

import java.util.HashSet;
import java.util.Optional;

import FootballScores.app.domain.Prediction;
import FootballScores.app.domain.User;
import FootballScores.app.dto.PredictionDTO;
import FootballScores.app.dto.PredictionKey;
import FootballScores.app.dto.UserDTO;
import FootballScores.app.repositories.GameRepository;
import FootballScores.app.repositories.UserRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;

@Controller("/users")
public class UserController {
	@Inject
	UserRepository repo;
	
	@Inject
	GameRepository gameRepo;
	
	@Get("/")
	Iterable<User> list(){
		return repo.findAll();
	}
	
	@Get("/{id}")
	Optional<User> get(Long id){
		return repo.findById(id);
	}
	
	@Post("/")
	HttpResponse<Void> add(@Body UserDTO userDetails){
		if(userDetails.getUsername().isBlank()){
			return HttpResponse.badRequest();
		}
		User user = new User();
		user.setUsername(userDetails.getUsername());
		user.setPredictions(new HashSet<Prediction>());
		user.setPoints(0L);
		repo.save(user);
		return HttpResponse.accepted();
	}
	
	@Put("/{userId}/prediction")
	HttpResponse<Void> newPred(Long userId, Long matchId, PredictionDTO predDto){
		if(repo.findById(userId).isEmpty() || gameRepo.findById(matchId).isEmpty()){
			return HttpResponse.badRequest();
		}
		User user = repo.findById(userId).get();
		PredictionKey predKey = new PredictionKey();
		predKey.setUser_Id(userId);
		predKey.setGame_Id(matchId);
		Prediction pred = new Prediction();
		pred.setId(predKey);
		pred.setUser(repo.findById(userId).get());
		pred.setGame(gameRepo.findById(matchId).get());
		pred.setTeam1Score(predDto.getTeam1Score());
		pred.setTeam2Score(predDto.getTeam2Score());
		user.getPredictions().add(pred);
		repo.update(user);
		return HttpResponse.accepted();
		
	}

}
