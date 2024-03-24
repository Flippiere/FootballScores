package FootballScores.app.client;

import FootballScores.app.domain.User;
import picocli.CommandLine.Command;

@Command(name = "get-users", description = "Returns all users in database",
mixinStandardHelpOptions = true)
public class GetUsersCommand implements Runnable {
	@jakarta.inject.Inject
	UserClient client;
	
	public void run(){
		for(User u: client.list()) {
			System.out.println(u);
		}
	}
}