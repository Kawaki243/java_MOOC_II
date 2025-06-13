public class Book implements Comparable<Book> {
	private String name;
	private int age;

	public Book(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public int compareTo(Book other){
		if(this.age != other.age){
			return this.age - other.age;
		} else{
			return this.name.compareTo(other.name);
		}
	}

	@Override
	public String toString() {
		return this.name + " (recommended for "+this.age+" year-olds or older)";
	}
}
