package at.htlwels.rajicdan;

public class Station {
	protected String name;
	protected Station station;

	public Station(String name) {
		super();
		
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
