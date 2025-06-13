public class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String toString(){
		String message = "";
		message = message + this.name + "\n" + "  " + this.address;
		return message;
	}
}
