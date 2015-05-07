package mh.abstractclass;

public class Hop extends Resource {

	private final int hopStorageTime = 100;
	
	public Hop(String name) {
		super(name);
		System.out.println("In Hop constructor");
	}

	@Override
	public void printStorageTime() {
		System.out.println("Storage time: " + hopStorageTime);
	}

}
