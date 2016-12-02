package at.htlwels.rajicdan;



import java.util.Date;
import java.util.LinkedList;

public class Train{
	protected String name;
	protected LinkedList<Stopps> stop = new LinkedList<Stopps>();
	

	
	public Train(String name, LinkedList<Stopps> stop) {
		super();
		this.name = name;
		this.stop = stop;
	}
	


	public Train(String name){
		this.name = name;
	}
	

	public void addStop(Date time,int platform ,String name){
		Stopps addstop = new Stopps(time, platform , new Station(name));
		stop.add(addstop);
	}
	
	
	
	
	public Stopps firstStop(){
		return stop.peekFirst();
		
	}
	
	public Stopps lastStop(){
		return stop.peekLast();
		
	}
	
	public Station firstStation(){
		return stop.peekFirst().station;
		
		
	}
	
	public Station lastStation(){
		return stop.peekLast().station;
		
	}
	
	public void allStops(){
		for(Object y: stop){
			System.out.println(y);
		}
	}
	
	public void remainStops(){
		
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


	/**
	 * @return the stop
	 */
	public LinkedList<Stopps> getStop() {
		return stop;
	}


	/**
	 * @param stop the stop to set
	 */
	public void setStop(LinkedList<Stopps> stop) {
		this.stop = stop;
	}
	
	
	


}
