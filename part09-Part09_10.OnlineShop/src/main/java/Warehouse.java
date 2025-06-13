import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Warehouse {
	private Map<String, Integer> prices;
	private Map<String, Integer> stocks;

	public Warehouse(){
		this.prices = new HashMap<>();
		this.stocks = new HashMap<>();
	}

	public void addProduct(String product, int price, int stock){
		if(price > 0 && stock >= 0){
			this.prices.put(product, price);
			this.stocks.put(product, stock);
		}
	}

	public int price(String product){
		if(this.prices.containsKey(product)){
			return this.prices.get(product);
		} else{
			return -99;
		}
	}

	public int stock(String product){
		if(this.stocks.containsKey(product)){
			return this.stocks.get(product);
		} else{
			return 0;
		}
	}

	public boolean take(String product){
		if(this.stock(product) > 0){
			this.stocks.put(product, this.stocks.get(product) - 1);
			return true;
		} else{
			return false;
		}
	}
	
	public Set<String> products(){
		return this.prices.keySet();
	} 
}
