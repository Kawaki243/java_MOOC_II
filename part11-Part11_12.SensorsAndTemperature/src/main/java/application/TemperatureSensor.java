package application;

public class TemperatureSensor implements Sensor{
	private Boolean onTemperature;

	public TemperatureSensor() {
		this.onTemperature = false;
	}

	public boolean isOn(){
		return this.onTemperature;
	}

	public void setOn(){
		this.onTemperature = true;
	}

	public void setOff(){
		this.onTemperature = false;
	}

	public int read(){
		if(this.isOn()){
			return (int) (Math.random()*61 - 30);
		} else{
			throw new IllegalStateException("Sensor is off");
		}
	}
}
