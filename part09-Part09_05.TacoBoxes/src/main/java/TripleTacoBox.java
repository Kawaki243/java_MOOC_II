public class TripleTacoBox implements TacoBox{
	private int tacos;

	public TripleTacoBox() {
		this.tacos = 3; // Initialize with 3 tacos
	}

	@Override
	public int tacosRemaining() {
		return this.tacos; 
	}

	@Override
	public void eat(){
		if(this.tacos > 0){
			this.tacos--;
		}
	}
	

}
