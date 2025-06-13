public class Teacher extends Person {
	private Integer teacherSalary;

	public Teacher(String name, String address, int salary) {
		super(name, address);
		this.teacherSalary = salary;
	}

	public String toString() {
		String message = super.toString();
		message = message + "\n" + "  salary " + this.teacherSalary + " euro/month";
		return message;
	}

}
