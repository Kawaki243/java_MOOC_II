public class Container {
	private Integer container;

	public Container(){
		this.container = 0;
	}

	public Integer getContainer(){
		return this.container;
	}

	public void add(int amount){
		if(amount < 0){
			return;
		} else{
			this.container = Math.min(this.container + amount, 100);
		}
	}

	public void remove(int amount){
		if(amount < 0){
			return;
		} else{
			this.container = Math.max(this.container - amount, 0);
		}
	}

	public String toString(){
		return this.container + "/100";
	}
}
