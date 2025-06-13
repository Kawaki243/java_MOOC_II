import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
	private HashMap<String, ArrayList<String>> storageMap;

	public StorageFacility(){
		this.storageMap = new HashMap<>();
	}

	public void add(String unit, String item){
		if(this.storageMap.containsKey(unit) == false){
			ArrayList<String> itemList = new ArrayList<>();
			itemList.add(item);
			this.storageMap.put(unit, itemList);
		} else{
			this.storageMap.get(unit).add(item);
		}
	}

	public ArrayList<String> contents(String storageUnit){
		if(this.storageMap.containsKey(storageUnit)){
			return this.storageMap.get(storageUnit);
		} else{
			return new ArrayList<>();
		}
	}

	public void remove(String storageUnit, String item){
		for(String unitItem : this.storageMap.get(storageUnit)){
			if(unitItem.equals(item)){
				this.storageMap.get(storageUnit).remove(unitItem);
				break;
			}
		}
		if(this.storageMap.get(storageUnit).isEmpty()){
			this.storageMap.remove(storageUnit);
		}
	}

	public ArrayList<String> storageUnits(){
		ArrayList<String> units = new ArrayList<>();
		for(String unitName : this.storageMap.keySet()){
			if(this.storageMap.get(unitName).isEmpty() == false){
				units.add(unitName);
			}
		}
		return units;
	}
}
