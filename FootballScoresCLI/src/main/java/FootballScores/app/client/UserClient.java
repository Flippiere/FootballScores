package FootballScores.app.client;

import java.util.HashSet;
import java.util.Optional;

import FootballScores.app.domain.User;
import FootballScores.app.dto.PredictionDTO;
import FootballScores.app.dto.UserDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;

@Client("${FootballScores.url:`http://localhost:8080/users`}")
public interface UserClient {
	
	@Get("/")
	Iterable<User> list();
	
	@Get("/{id}")
	Optional<User> get(Long id);
	
	@Post("/")
	HttpResponse<Void> add(@Body UserDTO userDetails);
	
	@Put("/{userId}/prediction")
	HttpResponse<Void> newPred(Long userId, Long matchId, PredictionDTO predDto);

}
