package FootballScores.app.client;

import java.util.Optional;

import FootballScores.app.domain.Team;
import FootballScores.app.dto.TeamDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client("${FootballScores.url:`http://localhost:8080/teams`}")
public interface TeamClient {
	
	@Get("/")
	Iterable<Team> list();
	
	@Get("/{id}")
	Optional<Team> get(Long id);
	
	@Post("/")
	HttpResponse<Void> add(@Body TeamDTO teamDetails);

}
