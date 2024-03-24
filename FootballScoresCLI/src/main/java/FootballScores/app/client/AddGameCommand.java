package FootballScores.app.client;

import FootballScores.app.dto.GameDTO;
import io.micronaut.http.HttpResponse;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "add-game", description = "Takes user details and then creates it in the database",
mixinStandardHelpOptions = true)
public class AddGameCommand implements Runnable {
	@jakarta.inject.Inject
	private GameClient client;
	
	@Parameters(index="0")
	private Long team1id;
	
	@Parameters(index="1")
	private Long team2id;
	
	public void run(){
		GameDTO dto = new GameDTO();
		dto.setTeam1Id(team1id);
		dto.setTeam2Id(team2id);
		
		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}
}