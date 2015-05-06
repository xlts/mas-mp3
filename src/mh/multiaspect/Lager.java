package mh.multiaspect;

public class Lager extends Beer {

	private boolean isReadyForLagering;

	public boolean isReadyForLagering() {
		return isReadyForLagering;
	}

	public void setReadyForLagering(boolean isReadyForLagering) {
		this.isReadyForLagering = isReadyForLagering;
	}
}
