package tn.esprit.MSConditions.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Camera {
      @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;

	  private String storing_dir;

	  private String state;
	  
	  private int movement_detection_flag ;
	  
	  private Timestamp Reading_time_detection ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoring_dir() {
		return storing_dir;
	}

	public void setStoring_dir(String storing_dir) {
		this.storing_dir = storing_dir;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getMovement_detection_flag() {
		return movement_detection_flag;
	}

	public void setMovement_detection_flag(int movement_detection_flag) {
		this.movement_detection_flag = movement_detection_flag;
	}

	public Timestamp getReading_time_detection() {
		return Reading_time_detection;
	}

	public void setReading_time_detection(Timestamp reading_time_detection) {
		Reading_time_detection = reading_time_detection;
	}

	
	  


}
