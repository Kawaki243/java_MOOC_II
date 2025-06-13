import java.util.HashMap;

public class IOU {
	private HashMap<String , Double> debts;

	public IOU(){
		this.debts = new HashMap<>();
	}

	public void setSum(String toWhom, double amount){
		this.debts.put(toWhom.toLowerCase().trim(), amount);
	}

	public double howMuchDoIOweTo(String toWhom){
		if(this.debts.containsKey(toWhom.toLowerCase().trim())){
			return this.debts.get(toWhom.toLowerCase().trim());
		} else{
			return 0.0;
		}
	}
}
