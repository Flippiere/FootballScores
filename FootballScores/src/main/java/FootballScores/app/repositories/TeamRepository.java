package FootballScores.app.repositories;

import FootballScores.app.domain.Team;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{
	
}
