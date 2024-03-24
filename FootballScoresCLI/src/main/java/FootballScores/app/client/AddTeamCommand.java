package FootballScores.app.client;

import FootballScores.app.dto.TeamDTO;
import FootballScores.app.dto.UserDTO;
import io.micronaut.http.HttpResponse;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "add-team", description = "Takes user details and then creates it in the database",
mixinStandardHelpOptions = true)
public class AddTeamCommand implements Runnable {
	@jakarta.inject.Inject
	private TeamClient client;
	
	@Parameters(index="0")
	private String name;
	
	public void run(){
		TeamDTO dto = new TeamDTO();
		dto.setName(name);
		
		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
