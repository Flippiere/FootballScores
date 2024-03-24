package FootballScores.app.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class PredictionDTO {
	private byte team1Score;
	private byte team2Score;
	private byte points;
	
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
	public byte getPoints() {
		return points;
	}
	public void setPoints(byte points) {
		this.points = points;
	}
}
