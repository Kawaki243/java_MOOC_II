package dictionary;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
	private Map<String, String> dictionary;
	private String fileName;

	public SaveableDictionary() {
		this.dictionary = new HashMap<>();
		this.fileName = null;
	}

	public SaveableDictionary(String file){
		this.dictionary = new HashMap<>();
		this.fileName = file;
	}

	public boolean load(){
		boolean success = false;
		try {
			Files.lines(Paths.get(this.fileName)).map(row -> row.split(":"))
			.filter(parts -> parts.length == 2)
			.forEach(parts -> this.dictionary.put(parts[0].toLowerCase().trim(), parts[1].toLowerCase().trim()));
			success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	public boolean save(){
		boolean success = false;
		try {
			StringBuilder sb = new StringBuilder();
			for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
				sb.append(entry.getKey()).append(":").append(entry.getValue()).append("\n");
			}
			Files.write(Paths.get(this.fileName), sb.toString().getBytes());
			success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	public void add(String words, String translation){
		if(this.dictionary.containsKey(words) == false){
			this.dictionary.put(words, translation);
		}
	}

	public String translate(String word){
		String res = null;
		if(this.dictionary.containsKey(word)){
			return this.dictionary.get(word);
		} 
		if(this.dictionary.containsValue(word)) {
			for(String key : this.dictionary.keySet()){
				if(this.dictionary.get(key).equals(word)){
					res = key;
				}
			}
		} 
		return res;
	}

	public void delete(String word){
		if(this.dictionary.containsKey(word)){
			this.dictionary.remove(word);
		}
		if(this.dictionary.containsValue(word)){
			for(String key : this.dictionary.keySet()){
				if(this.dictionary.get(key).equals(word)){
					this.dictionary.remove(key);
					break; // Exit after removing the first matching key
				}
			}
		}
	}
}
