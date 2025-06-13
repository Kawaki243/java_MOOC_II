public class Level implements Comparable<Level> {
	private String country;
	private int year;
	private String gender;
	private double literacyRate;

	public Level(String country, int year, String gender, double literacyRate) {
		this.country = country;
		this.year = year;
		this.gender = gender;
		this.literacyRate = literacyRate;
	}

	@Override
	public int compareTo(Level other){
		return Double.compare(this.literacyRate, other.literacyRate);
	}
	
	public String toSTring(){
		return this.country + " ("+this.year+"), "+this.gender+", "+this.literacyRate;
	}

	public double getLiteracyRate() {
		return this.literacyRate;
	}
}
