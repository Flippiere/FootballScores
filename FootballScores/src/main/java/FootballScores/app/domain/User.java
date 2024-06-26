package FootballScores.app.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column(nullable=false)
	private String username;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@MapsId("Prediction_id")
	@JoinColumn(name="Prediction_id")
	private Set<Prediction> predictions;
	
	@Column(nullable=false)
	private Long points;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Prediction> getPredictions() {
		return predictions;
	}

	public void setPredictions(Set<Prediction> predictions) {
		this.predictions = predictions;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}
}
