import java.util.ArrayList;

public class TodoList {
	private ArrayList<String> todoList;

	public TodoList(){
		this.todoList = new ArrayList<>();
	}

	public void add(String task){
		this.todoList.add(task);
	}

	public void print(){
		for(int i = 0; i<todoList.size();i++){
			int index = i + 1;
			System.out.println(index + ": "+todoList.get(i));
		}
	}

	public void remove(int number){
		if(number > 0 && number <= todoList.size()){
			todoList.remove(number-1);
		}
	}
}
