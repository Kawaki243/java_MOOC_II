public class Cat extends Animal implements NoiseCapable {
	private String name;

	public Cat(String name) {
		super(name);
		this.name = name;
	}

	public Cat(){
		super("Cat");
		this.name = "Cat";
	}

	public void makeNoise() {
		purr();
	}

	public void purr(){
		System.out.println(this.name+" purrs");
	}

}
