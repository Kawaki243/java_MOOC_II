import java.util.ArrayList;

public class ChangeHistory {
	private ArrayList<Double> historyList;

	public ChangeHistory() {
		this.historyList = new ArrayList<Double>();
	}

	public void add(double status) {
		this.historyList.add(status);
	}

	public void clear() {
		this.historyList.clear();
	}

	public double maxValue(){
		if(this.historyList.isEmpty()){
			return 0.0;
		} else{
			double maxHistory = this.historyList.get(0);
			for(double value : this.historyList){
				if(value > maxHistory){
					maxHistory = value;
				}
			}
			return maxHistory;
		}
	}

	public double minValue(){
		if(this.historyList.isEmpty()){
			return 0.0;
		} else{
			double minHistory = this.historyList.get(0);
			for(double value : this.historyList){
				if(value < minHistory){
					minHistory = value;
				}
			}
			return minHistory;
		}
	}

	public double average(){
		if(this.historyList.isEmpty()){
			return 0.0;
		} else{
			double sum = 0.0;
			for(double value : this.historyList){
				sum += value;
			}
			return sum / this.historyList.size();
		}
	}

	public String toString(){
		String message = "[";
		for(int i = 0; i < this.historyList.size(); i++) {
			if (i == 0) {
				message +=this.historyList.get(i);
			} else {
				message+=", " + this.historyList.get(i);
			}
		}
		message += "]";
		return message;
	}
}
