package FootballScores.app.dto;

public class PredictionDTO {
	private byte team1Score;
	private byte team2Score;
	private Long round;
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
	public Long getRound() {
		return round;
	}
	public void setRound(Long round) {
		this.round = round;
	}
	public byte getPoints() {
		return points;
	}
	public void setPoints(byte points) {
		this.points = points;
	}
}
