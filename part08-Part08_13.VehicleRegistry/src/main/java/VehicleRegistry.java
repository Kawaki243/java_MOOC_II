import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
	private HashMap<LicensePlate, String> register;

	public VehicleRegistry(){
		this.register = new HashMap<>();
	}

	public boolean add(LicensePlate licensePlate, String owner){
		if(this.register.containsKey(licensePlate)){
			return false;
		} else{
			this.register.put(licensePlate,owner);
			return true;
		}
	}

	public String get(LicensePlate licensePlate){
		if(this.register.containsKey(licensePlate)){
			return this.register.get(licensePlate);
		} else{
			return null;
		}

	}

	public boolean remove(LicensePlate licensePlate){
		if(this.register.containsKey(licensePlate)){
			this.register.remove(licensePlate);
			return true;
		} else{
			return false;
		}
	}

	public void printLicensePlates(){
		for(LicensePlate licensePlate : this.register.keySet()){
			System.out.println(licensePlate);
		}
	}

	public void printOwners(){
		HashSet<String> owners = new HashSet<>();
 		for(String owner : this.register.values()){
			owners.add(owner);
		}

		for(String owner : owners){
			System.out.println(owner);
		}
	}
}
