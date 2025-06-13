import java.util.ArrayList;
import java.util.List;

public class Hideout<T>{
	private List<T> hiddenItems;

	public Hideout() {
		this.hiddenItems = new ArrayList<>();
	}

	public void putIntoHideout(T toHide){
		if(this.hiddenItems.isEmpty()) {
			this.hiddenItems.add(toHide);
		} else {
			this.hiddenItems.remove(0);
			this.hiddenItems.add(toHide);
		}
	}

	public T takeFromHideout(){
		if(this.hiddenItems.isEmpty()) {
			return null;
		} else {
			T item = this.hiddenItems.get(0);
			this.hiddenItems.remove(0);
			return item;
		}
	}

	public boolean isInHideout(){
		return this.hiddenItems.size() == 1;
	}
}
