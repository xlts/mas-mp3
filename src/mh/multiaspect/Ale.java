package mh.multiaspect;

import java.util.Date;

public class Ale extends Beer {

	private String yeastStrainOrigin;
	
	public Ale(String yeastStrainOrigin, int productionRate) {
		super(productionRate);
		this.setYeastStrainOrigin(yeastStrainOrigin);
	}
	
	public Ale(String yeastStrainOrigin, String suggestedGlass, Date releasedate){
		super(suggestedGlass, releasedate);
		this.setYeastStrainOrigin(yeastStrainOrigin);
	}

	public String getYeastStrainOrigin() {
		return yeastStrainOrigin;
	}

	public void setYeastStrainOrigin(String yeastStrainOrigin) {
		if (yeastStrainOrigin == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.yeastStrainOrigin = yeastStrainOrigin;
	}
}
