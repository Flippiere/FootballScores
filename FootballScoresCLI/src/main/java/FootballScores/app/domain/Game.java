package FootballScores.app.domain;

import java.time.LocalDateTime;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Game {
	private Long id;
	private LocalDateTime time;
	private Team team1;
	private Team team2;
	private byte team1Score;
	private byte team2Score;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public byte getTeam1Score() {
		return team1Score;
	}

	public void setTeam1Score(byte team1Score) {
		this.team1Score = team1Score;
	}

	public byte getTeam2Score() {
		return team2Score;
	}

	public void setTeam2Score(byte team2Score) {
		this.team2Score = team2Score;
	}
}
