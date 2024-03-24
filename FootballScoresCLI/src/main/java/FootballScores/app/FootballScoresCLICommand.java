package FootballScores.app;

import FootballScores.app.client.AddGameCommand;
import FootballScores.app.client.AddPredictionCommand;
import FootballScores.app.client.AddTeamCommand;
import FootballScores.app.client.AddUserCommand;
import FootballScores.app.client.GetUsersCommand;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "FootballScoresCLI", description = "...",
        mixinStandardHelpOptions = true, subcommands = {
        GetUsersCommand.class, AddUserCommand.class, AddTeamCommand.class,
        AddGameCommand.class, AddPredictionCommand.class})
public class FootballScoresCLICommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(FootballScoresCLICommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
