package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
	private List<Sensor> sensorList;
	private List<Integer> readingsAverage;

	public AverageSensor(){
		this.sensorList = new ArrayList<>();
		this.readingsAverage = new ArrayList<>();
	}

	public void addSensor(Sensor sensor){
		this.sensorList.add(sensor);
	}

	public boolean isOn(){
		if(this.sensorList.isEmpty()){
			return false;
		}
		for(Sensor sensor : this.sensorList){
			if(!sensor.isOn()){
				return false;
			}
		}
		return true;
	}

	public void setOn(){
		for(Sensor sensor : this.sensorList){
			sensor.setOn();
		}
	}

	public void setOff(){
		for(Sensor sensor : this.sensorList){
			sensor.setOff();
		}
	}

	public int read(){
		if(this.isOn() == false || this.sensorList.isEmpty()){
			throw new IllegalStateException("Average sensor is off or has no sensors");
		} else{
			int average = this.sensorList.stream()
				.mapToInt(Sensor::read)
				.sum() / this.sensorList.size();
			this.readingsAverage.add(average);
			return average;
		}
	}

	public List<Integer> readings(){
		return this.readingsAverage;
	}
}
