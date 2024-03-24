package FootballScores.app.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

import FootballScores.app.domain.Team;

public class GameDTO {
	private LocalDateTime time;
	private Long team1Id;
	private Long team2Id;
	private byte team1Score;
	private byte team2Score;
	
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Long getTeam1Id() {
		return team1Id;
	}
	public void setTeam1Id(Long team1Id) {
		this.team1Id = team1Id;
	}
	public Long getTeam2Id() {
		return team2Id;
	}
	public void setTeam2Id(Long team2Id) {
		this.team2Id = team2Id;
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
