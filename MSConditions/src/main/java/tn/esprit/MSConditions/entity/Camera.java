package tn.esprit.MSConditions.entity;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Camera {
      @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;

	  private double storing_dir;

	  private double state;
	  
	  private int movement_detection ;
	  
	  private Timestamp Reading_time ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getStoring_dir() {
		return storing_dir;
	}

	public void setStoring_dir(double storing_dir) {
		this.storing_dir = storing_dir;
	}

	public double getState() {
		return state;
	}

	public void setState(double state) {
		this.state = state;
	}

	public int getMovement_detection() {
		return movement_detection;
	}

	public void setMovement_detection(int movement_detection) {
		this.movement_detection = movement_detection;
	}

	public Timestamp getReading_time() {
		return Reading_time;
	}

	public void setReading_time(Timestamp reading_time) {
		Reading_time = reading_time;
	}

	
	  


}
