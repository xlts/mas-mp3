package mh.multiaspect;

import java.util.Date;

public abstract class Beer { //cannot be instantiated

	
	/*
	 * composition-based multi-aspect inhertance
	 * 
	 */
	
	private BeerTarget beerTarget;
	
	public Beer(int productionRate){
		transformIntoMassProducedBeer(productionRate);
	}
	
	public Beer(String suggestedGlass, Date releasedate){
		transformIntoSpecialtyBeer(suggestedGlass, releasedate);
	}
	
	public void transformIntoMassProducedBeer(Integer productionRate) {
		if (productionRate == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.beerTarget = new MassProducedBeer(productionRate);
	}
	
	public void transformIntoSpecialtyBeer(String suggestedGlass, Date releasedate) {
		if (suggestedGlass == null || releasedate == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		this.beerTarget = new SpecialtyBeer(suggestedGlass, releasedate);
	}
	
	public int getProductionRate() {
		return beerTarget.getProductionRate();
	}

	public void setProductionRate(Integer productionRate) {
		if (productionRate == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		beerTarget.setProductionRate(productionRate);
	}
	
	
	public String getSuggestedGlass(){
		return beerTarget.getSuggestedGlass();
	}
	
	public void setSuggestedGlass(String suggestedGlass){
		if (suggestedGlass == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		beerTarget.setSuggestedGlass(suggestedGlass);
	}
	
	public Date getReleaseDate() {
		return beerTarget.getReleaseDate();
	}

	public void setReleaseDate(Date releaseDate) {
		if (releaseDate == null) {
			throw new IllegalArgumentException("passed a null value");
		}
		beerTarget.setReleaseDate(releaseDate);
	}
	
	private abstract class BeerTarget {
		public abstract int getProductionRate();
		public abstract void setProductionRate(int productionRate);
		public abstract void setSuggestedGlass(String suggestedGlass);
		public abstract String getSuggestedGlass();
		public abstract Date getReleaseDate();
		public abstract void setReleaseDate(Date releaseDate);
	}
	
	private class MassProducedBeer extends BeerTarget {
		private int productionRate;
		
		private MassProducedBeer(int productionRate){
			this.setProductionRate(productionRate);
		}

		public int getProductionRate() {
			return productionRate;
		}

		public void setProductionRate(int productionRate) {
			this.productionRate = productionRate;
		}

		@Override
		public void setSuggestedGlass(String suggestedGlass) {
			throw new RuntimeException("Not a specialty beer");
		}

		@Override
		public String getSuggestedGlass() {
			throw new RuntimeException("Not a specialty beer");
		}

		@Override
		public Date getReleaseDate() {
			throw new RuntimeException("Not a specialty beer");
		}

		@Override
		public void setReleaseDate(Date releaseDate) {
			throw new RuntimeException("Not a specialty beer");
		}
	}
	
	private class SpecialtyBeer extends BeerTarget {
		private String suggestedGlass;
		private Date releaseDate;
		
		private SpecialtyBeer(String suggestedGlass, Date releasedate) {
			this.setSuggestedGlass(suggestedGlass);
			this.setReleaseDate(releasedate);
		}

		public String getSuggestedGlass() {
			return suggestedGlass;
		}

		public void setSuggestedGlass(String suggestedGlass) {
			this.suggestedGlass = suggestedGlass;
		}


		public Date getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(Date releaseDate) {
			this.releaseDate = releaseDate;
		}

		@Override
		public int getProductionRate() {
			throw new RuntimeException("Not a mass-produced beer");
		}

		@Override
		public void setProductionRate(int productionRate) {
			throw new RuntimeException("Not a mass-produced beer");
			
		}

	}
}
