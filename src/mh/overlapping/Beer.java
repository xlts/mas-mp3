package mh.overlapping;

import java.util.EnumSet;

public class Beer implements IAle, ILager {

	private boolean canBeLagered;
	private int lageringTime;
	private int fermentationTemperature;
	
	private EnumSet<BeerType> beerTypes;
	
	public Beer(boolean canBeLagered, int lageringTime, int fermentationTemperature, EnumSet<BeerType> beerTypes) {
		
		if (beerTypes != null) {
			if (!beerTypes.isEmpty()) {
				this.canBeLagered  = canBeLagered;
				this.lageringTime = lageringTime;
				this.fermentationTemperature = fermentationTemperature;
				this.beerTypes = beerTypes;
			}
		}
		
	}
	
	@Override
	public void prepareForLagering() {
		if (!beerTypes.contains(BeerType.LAGER)) {
			throw new RuntimeException("Not a lager");
		}
		canBeLagered = true;
	}

	@Override
	public int getLageringTime() {
		if (!beerTypes.contains(BeerType.LAGER)) {
			throw new RuntimeException("Not a lager");
		}
		return this.lageringTime;
	}

	@Override
	public void increaseFermentationTemp(Integer temp) {
		if (temp == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		if (!beerTypes.contains(BeerType.ALE)) {
			throw new RuntimeException("Not an ale");
		}
		this.fermentationTemperature += temp;
	}

	@Override
	public void setLageringTime(Integer time) {
		if (time == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		if (!beerTypes.contains(BeerType.LAGER)) {
			throw new RuntimeException("Not a lager");
		}
		this.lageringTime = time;
	}

	public boolean isCanBeLagered() {
		return canBeLagered;
	}

	public int getFermentationTemperature() {
		return fermentationTemperature;
	}
}
