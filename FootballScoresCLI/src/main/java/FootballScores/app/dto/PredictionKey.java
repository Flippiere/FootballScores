package FootballScores.app.dto;

import java.io.Serializable;

public class PredictionKey implements Serializable{
	Long user_Id;
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
