package FootballScores.app.repositories;

import FootballScores.app.domain.Game;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface GameRepository extends CrudRepository<Game,Long>{

}
