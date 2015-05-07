package mh.multiinheritance;

public class ColonaryIngredient extends Resource implements IServingSuggestion {

	private String origin;
	
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		if (origin == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.origin = origin;
	}

}
