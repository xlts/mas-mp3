package mh.multiinheritance;

public class ServingSuggestion implements IServingSuggestion  {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.name = name;
	}
}
