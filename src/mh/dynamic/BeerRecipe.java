package mh.dynamic;

import java.util.Date;

public class BeerRecipe implements IModernBeerRecipe, IHistoricBeerRecipe {

	private BeerRecipeType beerRecipeType;
	
	private String origin;
	private Date introductionDate;

	@Override
	public void setOrigin(String countryName) {
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
		if (beerRecipeType == BeerRecipeType.MODERN) {
			throw new RuntimeException("Not a modern beer recipe");
		}
		this.introductionDate = date;
		
	}
}
