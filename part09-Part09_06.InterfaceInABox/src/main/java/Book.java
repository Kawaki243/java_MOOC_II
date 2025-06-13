public class Book implements Packable{
	private String authorName;
	private String name;
	private double weight;

	public Book(String authorName, String name, double weight) {
		this.authorName = authorName;
		this.name = name;
		this.weight = weight;
	}

	@Override
	public double weight() {
		return this.weight;
	}

	public String toString(){
		return this.authorName + ": "+this.name;
	}
}
