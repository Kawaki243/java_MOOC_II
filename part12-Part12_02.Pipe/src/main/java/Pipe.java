import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
	private List<T> pipeList;

	public Pipe(){
		this.pipeList = new ArrayList<>();
	}

	public void putIntoPipe(T value){
		this.pipeList.add(value);
	}

	public T takeFromPipe(){
		if(this.pipeList.isEmpty()){
			return null;
		} else{
			T item = this.pipeList.get(0);
			this.pipeList.remove(0);
			return item;
		}
	}

	public boolean isInPipe(){
		return this.pipeList.size() > 0;
	}
}
