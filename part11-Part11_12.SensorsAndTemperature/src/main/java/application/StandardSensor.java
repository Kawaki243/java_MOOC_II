package application;

public class StandardSensor implements Sensor{
	private Integer number;

	public StandardSensor(int arvo) {
		this.number = arvo;
	}

	public boolean isOn(){
		return true;
	}

	public void setOn(){}

	public void setOff(){}

	public int read(){
		return this.number;
	}
}
