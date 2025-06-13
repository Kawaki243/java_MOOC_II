import java.util.Map;

public class ShoppingCart {
	private Map<String, Item> carts;

	public ShoppingCart() {
		this.carts = new java.util.HashMap<>();
	}

	public void add(String product, int price){
		Item item = new Item(product, 1, price);
		if (this.carts.containsKey(product)) {
			this.carts.get(product).increaseQuantity();
		} else {
			this.carts.put(product, item);
		}
	}

	public int price(){
		int total = 0;
		for(Item item : this.carts.values()){
			total = total + item.price();
		}
		return total;
	}

	public void print(){
		for(Item item : this.carts.values()){
			System.out.println(item);
		}
	}
}
