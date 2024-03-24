package FootballScores.app.repositories;

import FootballScores.app.domain.Prediction;
import FootballScores.app.dto.PredictionKey;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PredictionRepository extends CrudRepository<Prediction, PredictionKey>{
	
}
