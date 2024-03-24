package FootballScores.app.client;

import FootballScores.app.domain.Prediction;
import FootballScores.app.dto.PredictionDTO;
import FootballScores.app.dto.UserDTO;
import io.micronaut.http.HttpResponse;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "add-pred", description = "Takes user details and then creates it in the database",
mixinStandardHelpOptions = true)
public class AddPredictionCommand implements Runnable {
	@jakarta.inject.Inject
	private UserClient client;
	
	@Parameters(index="0")
	private Long userId;
	
	@Parameters(index="1")
	private Long gameId;
	
	@Parameters(index="2")
	private byte score1;
	
	@Parameters(index="3")
	private byte score2;
	
	public void run(){
		PredictionDTO dto = new PredictionDTO();
		dto.setTeam1Score(score1);
		dto.setTeam2Score(score2);
		
		HttpResponse<Void> response = client.newPred(userId, gameId, dto);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
