import java.util.ArrayList;

public class Box implements Packable {
	private ArrayList<Packable> items;
	private double maxCapacity;

	public Box(double maxCapacity) {
		this.items = new ArrayList<>();
		this.maxCapacity = maxCapacity;
	}

	public void add(Packable item){
		if(item.weight() <= this.maxCapacity){
			this.items.add(item);
			this.maxCapacity = this.maxCapacity - item.weight();
		}
	}

	public double weight() {
		double totalWeight = 0.0;
		if(this.items.isEmpty()) {
			return totalWeight;
		} else{
			for (Packable item : this.items) {
				totalWeight += item.weight();
			}
			return totalWeight;
		}
	}

	public String toString(){
		return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
	}
}
