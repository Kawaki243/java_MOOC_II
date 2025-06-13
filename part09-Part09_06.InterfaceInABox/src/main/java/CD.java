public class CD implements Packable{
	private String artistName;
	private String nameCD;
	private int publicationYear;
	private double weight;

	public CD(String artistName, String nameCD, int publicationYear) {
		this.artistName = artistName;
		this.nameCD = nameCD;
		this.publicationYear = publicationYear;
		this.weight = 0.1;
	}

	@Override
	public double weight() {
		return this.weight;
	}

	public String toString() {
		return this.artistName + ": " + this.nameCD + " (" + this.publicationYear + ")";
	}
}
