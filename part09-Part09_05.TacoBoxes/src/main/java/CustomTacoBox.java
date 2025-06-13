public class CustomTacoBox implements TacoBox{
	private int tacos;

	public CustomTacoBox(int initialTacos) {
		this.tacos = initialTacos; // Initialize with the specified number of tacos
	}

	public int tacosRemaining(){
		return this.tacos;
	}

	public void eat(){
		if(this.tacos > 0){
			this.tacos--;
		}
	}
}
