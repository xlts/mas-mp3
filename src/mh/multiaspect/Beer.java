package mh.multiaspect;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Beer { //cannot be instantiated

	
	/*
	 * composition-based multi-aspect inhertance
	 * 
	 */
	class MassProducedBeer {
		private int productionRate;
	}
	
	class SpecialtyBeer {
		private String suggestedGlass;
		private int suggestedServingTemperature;
		private Date releaseDate;
	}
}
