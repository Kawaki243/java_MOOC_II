import java.util.ArrayList;

public class OneItemBox extends Box{
	private Integer itemCount;
	private ArrayList<Item> items;

	public OneItemBox(){
		this.itemCount = 0;
		this.items = new ArrayList<>();
	}

	@Override
	public void add(Item item){
		if(this.itemCount == 0){
			this.items.add(item);
			this.itemCount++;
		}
	}

	@Override
	public boolean isInBox(Item item){
		if(this.itemCount == 0){
			return false;
		}
		return this.items.get(0).equals(item);
	}


}
