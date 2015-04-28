package mh.dynamic;

import java.util.Date;

public class BeerRecipe implements IModernBeerRecipe, IHistoricBeerRecipe {

	private BeerRecipeType beerRecipeType;

	@Override
	public void setOrigin(String countryName) {
		if (beerRecipeType == BeerRecipeType.HISTORIC) {
			
		}
	}

	@Override
	public Date getIntroductionDate() {
		if (beerRecipeType == BeerRecipeType.MODERN) {
			
		}
		return null;
	}
}
