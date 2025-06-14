public class ProductWarehouse extends Warehouse{
	private String productName;
	
	public ProductWarehouse(String productName, double capacity){
		super(capacity);
		this.productName = productName;
	}

	public String getName(){
		return this.productName;
	}

	public void setName(String newName) {
		this.productName = newName;
	}

	public String toString() {
		String message = "";
		message = message + this.productName + ": "+super.toString();
		return message;
	}

}
