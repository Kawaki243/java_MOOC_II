import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
	private HashMap<String, ArrayList<String>> translation;

	public DictionaryOfManyTranslations() {
		this.translation = new HashMap<>();
	}

	public void add(String word, String translation){
		if(this.translation.containsKey(word) == false){
			ArrayList<String> translationList = new ArrayList<>();
			translationList.add(translation);
			this.translation.put(word, translationList);
		} else{
			this.translation.get(word).add(translation);
		}
	}

	public ArrayList<String> translate(String word){
		if(this.translation.containsKey(word)){
			return this.translation.get(word);
		} else{
			return new ArrayList<>();
		}
	}

	public void remove(String word){
		this.translation.remove(word);
	}
}
