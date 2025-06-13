public class ProductWarehouseWithHistory extends ProductWarehouse{
	private ChangeHistory historyList;

	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
		super(productName,capacity);
		this.historyList = new ChangeHistory();
		this.historyList.add(initialBalance);
		super.addToWarehouse(initialBalance);
	}

	public String history() {
		return this.historyList.toString();
	}

	public void addToWarehouse(double amount){
		if(amount > 0){
			super.addToWarehouse(amount);
			this.historyList.add(super.getBalance());
		}
	}

	public double takeFromWarehouse(double amount){
		if(amount > 0){
			double taken = super.takeFromWarehouse(amount);
			this.historyList.add(super.getBalance());
			return taken;
		} else {
			return 0.0;
		}
	}

	public void printAnalysis(){
		System.out.println("Product: "+super.getName());
		System.out.println("History: "+this.history());
		System.out.println("Largest amount of product: "+this.historyList.maxValue());
		System.out.println("Smallest amount of product: "+this.historyList.minValue());
		System.out.println("Average: "+this.historyList.average());
	}
}
