package FootballScores.app.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class UserDTO {
	private String username;
	private Long points;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}
}
