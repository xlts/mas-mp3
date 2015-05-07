package mh.multiaspect;

import java.util.Date;

public class Lager extends Beer {

	private boolean isReadyForLagering;

	
	public Lager(boolean isReadyForLagering, int productionRate) {
		super(productionRate);
		this.setReadyForLagering(isReadyForLagering);
	}
	
	public Lager(boolean isReadyForLagering, String suggestedGlass, Date releasedate){
		super(suggestedGlass, releasedate);
		this.setReadyForLagering(isReadyForLagering);
	}
	
	public boolean isReadyForLagering() {
		return isReadyForLagering;
	}

	public void setReadyForLagering(Boolean isReadyForLagering) {
		if (isReadyForLagering == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.isReadyForLagering = isReadyForLagering;
	}
}
