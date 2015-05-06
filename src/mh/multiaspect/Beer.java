package mh.multiaspect;

import java.util.Date;

public abstract class Beer { //cannot be instantiated

	
	/*
	 * composition-based multi-aspect inhertance
	 * 
	 */
	
	private BeerTarget beerTarget;
	
	public void transformIntoMassProducedBeer(int productionRate) {
		this.beerTarget = new MassProducedBeer(productionRate);
	}
	
	public void transformIntoSpecialtyBeer(String suggestedGlass, int suggestedServingTemperature, Date releasedate) {
		this.beerTarget = new SpecialtyBeer(suggestedGlass, suggestedServingTemperature, releasedate);
	}
	
	private abstract class BeerTarget {
		
	}
	
	private class MassProducedBeer extends BeerTarget {
		private int productionRate;
		
		private MassProducedBeer(int productionRate){
			this.setProductionRate(productionRate);
		}

		private int getProductionRate() {
			return productionRate;
		}

		private void setProductionRate(int productionRate) {
			this.productionRate = productionRate;
		}
	}
	
	private class SpecialtyBeer extends BeerTarget {
		private String suggestedGlass;
		private int suggestedServingTemperature;
		private Date releaseDate;
		
		private SpecialtyBeer(String suggestedGlass, int suggestedServingTemperature, Date releasedate) {
			this.setSuggestedGlass(suggestedGlass);
			this.setSuggestedServingTemperature(suggestedServingTemperature);
			this.setReleaseDate(releasedate);
		}

		private String getSuggestedGlass() {
			return suggestedGlass;
		}

		private void setSuggestedGlass(String suggestedGlass) {
			this.suggestedGlass = suggestedGlass;
		}

		private int getSuggestedServingTemperature() {
			return suggestedServingTemperature;
		}

		private void setSuggestedServingTemperature(
				int suggestedServingTemperature) {
			this.suggestedServingTemperature = suggestedServingTemperature;
		}

		private Date getReleaseDate() {
			return releaseDate;
		}

		private void setReleaseDate(Date releaseDate) {
			this.releaseDate = releaseDate;
		}
	}
}
