package mh.multiinheritance;

public class Resource {

	private String name;
	private String usageDescription;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.name = name;
	}
	public String getUsageDescription() {
		return usageDescription;
	}
	public void setUsageDescription(String usageDescription) {
		if (usageDescription == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.usageDescription = usageDescription;
	}
}
