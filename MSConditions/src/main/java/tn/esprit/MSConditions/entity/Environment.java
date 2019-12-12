package tn.esprit.MSConditions.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Environment {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private double Temperature;

  private double Humidity;
  
  private Timestamp Reading_time ;
  
  private int battery ;

public int getBattery() {
	return battery;
}

public void setBattery(int battery) {
	this.battery = battery;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public double getTemperature() {
	return Temperature;
}

public void setTemperature(double temperature) {
	Temperature = temperature;
}

public Timestamp getReading_time() {
	return Reading_time;
}

public void setReading_time(Timestamp l) {
	Reading_time = l;
}

public double getHumidity() {
	return Humidity;
}

public void setHumidity(double humidity) {
	Humidity = humidity;
}

  

}