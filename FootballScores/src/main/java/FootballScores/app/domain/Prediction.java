package FootballScores.app.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import FootballScores.app.dto.PredictionKey;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@Entity
public class Prediction {
	
	@EmbeddedId
	private PredictionKey id;
	
	@ManyToOne
	@MapsId("user_id")
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@MapsId("game_id")
	@JoinColumn(name="game_id")
	private Game game;
	
	@Column
	private byte team1Score;
	
	@Column
	private byte team2Score;
	
	@Column
	private Long round;
	
	@Column
	private byte points;

	public PredictionKey getId() {
		return id;
	}

	public void setId(PredictionKey id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
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
