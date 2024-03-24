package FootballScores.app.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PredictionKey implements Serializable{
	
	@Column
	Long user_Id;
	
	@Column
	Long game_Id;

	public Long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}

	public Long getGame_Id() {
		return game_Id;
	}

	public void setGame_Id(Long game_Id) {
		this.game_Id = game_Id;
	}

}
