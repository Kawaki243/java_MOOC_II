public class Student extends Person{
	private Integer studentCredits;

	public Student(String name, String address) {
		super(name, address);
		this.studentCredits = 0;
	}

	public void study(){
		this.studentCredits += 1;
	}

	public int credits(){
		return this.studentCredits;
	}

	public String toString(){
		String message = super.toString();
		message = message + "\n" + "  Study credits "+this.studentCredits;
		return message;
	}
}
