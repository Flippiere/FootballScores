package FootballScores.app.client;

import FootballScores.app.dto.UserDTO;
import io.micronaut.http.HttpResponse;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "add-user", description = "Takes user details and then creates it in the database",
mixinStandardHelpOptions = true)
public class AddUserCommand implements Runnable {
	@jakarta.inject.Inject
	private UserClient client;
	
	@Parameters(index="0")
	private String username;
	
	public void run(){
		UserDTO dto = new UserDTO();
		dto.setUsername(username);
		
		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
