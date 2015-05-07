package mh.abstractclass;

public abstract class Resource {
	
	private String name;
	
	public Resource(String name) {
		this.setName(name);
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		if (name == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.name = name;
	}
	
	public abstract void printStorageTime();
	
}
