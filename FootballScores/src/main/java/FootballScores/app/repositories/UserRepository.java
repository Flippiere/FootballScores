package FootballScores.app.repositories;

import FootballScores.app.domain.User;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

}
