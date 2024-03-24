package FootballScores.app.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class TeamDTO {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
