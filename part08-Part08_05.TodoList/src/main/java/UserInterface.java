import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;
	private TodoList todoList;

	public UserInterface(TodoList todoList, Scanner scanner) {
		this.todoList = todoList;
		this.scanner = scanner;
	}

	public void start(){
		Boolean continueLoop = true;

		while(continueLoop){
			System.out.print("Command: ");
			String message = this.scanner.nextLine();
			if(message.equals("stop")){
				continueLoop = false;
			} else if(message.equals("add")){
				System.out.print("To add: ");
				String task = this.scanner.nextLine();
				this.todoList.add(task);
			} else if(message.equals("list")){
				this.todoList.print();
			} else if(message.equals("remove")){
				System.out.print("Which one is removed? ");
				int number = Integer.valueOf(this.scanner.nextLine());
				this.todoList.remove(number);
			} else{
				System.out.println("Unknown command");
			}
		}
	}
}
