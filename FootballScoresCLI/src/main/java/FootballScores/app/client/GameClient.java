package FootballScores.app.client;

import java.util.Optional;

import FootballScores.app.domain.Game;
import FootballScores.app.dto.GameDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client("${FootballScores.url:`http://localhost:8080/games`}")
public interface GameClient {
	
	@Get("/")
	Iterable<Game> list();
	
	@Get("/{id}")
	Optional<Game> get(Long id);
	
	@Post("/")
	HttpResponse<Void> add(@Body GameDTO gameDetails);

}
