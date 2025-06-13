import java.util.HashMap;

public class Abbreviations {
	HashMap<String, String> abbreviationMap;

	public Abbreviations() {
		this.abbreviationMap = new HashMap<>();
	}

	public void addAbbreviation(String abbreviation, String explanation){
		if(this.hasAbbreviation(abbreviation) == false){
			String sanitizedStringAbbreviation = abbreviation.toLowerCase();
			this.abbreviationMap.put(sanitizedStringAbbreviation.trim(), explanation);
		}
	}

	public boolean hasAbbreviation(String abbreviation){
		if(this.abbreviationMap.containsKey(abbreviation.toLowerCase().trim())){
			return true;
		} else{
			return false;
		}
	}

	public String findExplanationFor(String abbreviation){
		if(this.hasAbbreviation(abbreviation) == false){
			return null;
		} else{
			return this.abbreviationMap.get(abbreviation.toLowerCase().trim());
		}
	}
}
