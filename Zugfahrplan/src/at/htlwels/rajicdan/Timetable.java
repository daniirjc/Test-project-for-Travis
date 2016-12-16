package at.htlwels.rajicdan;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Timetable {

	protected Station bahnhof;
	protected LinkedList<Train> trains = new LinkedList<Train>();



	public Timetable(Station bahnhof, LinkedList<Train> trains) {
		super();
		this.bahnhof = bahnhof;
		this.trains = trains;
	}



	public void ausgabe(){
		System.out.println("Timetable");
		System.out.println("-----------------------------------------");


		for(Train y: trains){
			Collections.sort(y.stop, new Comparator<Stopps>(){

				@Override
				public int compare(Stopps s1, Stopps s2) {
					if(s1.time.before(s2.time)){
						return -1;
					}
					else if(s1.time.after(s2.time)){
						return 1;
					}
					return 0;
				}



			});
			System.out.println("Name vom Zug: " + y.getName());
			int i = 1;
			for(Stopps x: y.stop){

				System.out.println("Stop" + i + ": " + x.station.getName() + ", Plattform: " + x.platform + ", Uhrzeit: " + x.time);
				System.out.println();
				i++;
			}
		}
	}

	public static void main(String args[]){
		Calendar c = Calendar.getInstance();
		c.set(2016, 4, 12 , 2,10);
		Train REX = new Train("REX");
		REX.addStop(c.getTime(), 5, "Wien Westbahnhof");
		c.set(2016, 4, 12 , 9,25);;
		REX.addStop(c.getTime(), 2, "Graz Hbf");
		c.set(2016, 4, 12 , 11,22);;
		REX.addStop(c.getTime(), 3, "Salzburg Hbf");
		c.set(2016, 4, 12 , 13,07);;
		Train Rail = new Train("RAIL");
		Rail.addStop(c.getTime(), 7, "Wels Hbf");
		c.set(2016, 4, 12 , 16,59);;
		Rail.addStop(c.getTime(), 1, "Linz Hbf");
		c.set(2016, 4, 12 , 19,46);;
		Rail.addStop(c.getTime(), 4, "Urfahr");




		LinkedList<Train> alltrains = new LinkedList<Train>(Arrays.asList(REX, Rail));

		Timetable gg = new Timetable(new Station("Wien"), alltrains);

		gg.ausgabe();



	}

}
