package mh.dynamic;

import java.util.Date;

public class BeerRecipe implements IModernBeerRecipe, IHistoricBeerRecipe {

	private BeerRecipeType beerRecipeType;
	
	private String origin;
	private Date introductionDate;
	
	public BeerRecipe(BeerRecipeType beerRecipeType){
		this.setBeerRecipeType(beerRecipeType);
	}
	

	public BeerRecipeType getBeerRecipeType() {
		return beerRecipeType;
	}

	public void setBeerRecipeType(BeerRecipeType beerRecipeType) {
		if (beerRecipeType == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.beerRecipeType = beerRecipeType;
	}

	@Override
	public void setOrigin(String countryName) {
		if (countryName == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		if (beerRecipeType != BeerRecipeType.HISTORIC) {
			throw new RuntimeException("Not a historic beer recipe");
		}
		this.origin = countryName;
	}

	@Override
	public Date getIntroductionDate() {
		if (beerRecipeType == BeerRecipeType.MODERN) {
			throw new RuntimeException("Not a modern beer recipe");
		}
		return this.introductionDate;
	}

	@Override
	public String getOrigin() {
		if (beerRecipeType != BeerRecipeType.HISTORIC) {
			throw new RuntimeException("Not a historic beer recipe");
		}
		return this.origin;
	}

	@Override
	public void setIntroductionDate(Date date) {
		if (date == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		if (beerRecipeType == BeerRecipeType.MODERN) {
			throw new RuntimeException("Not a modern beer recipe");
		}
		this.introductionDate = date;
		
	}
}
