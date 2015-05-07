package mh.abstractclass;

public class Yeast extends Resource {

	private final int yeastStorageTime = 30;
	
	public Yeast(String name) {
		super(name);
		System.out.println("In Yeast constructor");
	}

	@Override
	public void printStorageTime() {
		System.out.println("Yeast storage time: " + this.yeastStorageTime);
	}

}
