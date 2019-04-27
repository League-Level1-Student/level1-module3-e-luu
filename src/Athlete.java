
public class Athlete {
	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public static void main(String[] args) {
		// create two athletes //print their names, bibNumbers, and the location of
		// their race. 
		Athlete Bobby = new Athlete("Bobby", 7);
		Athlete Martha = new Athlete("Martha", 10);
		Bobby.bibNumber++;
		Martha.bibNumber+=4;
		System.out.println(raceLocation);
		System.out.println(raceStartTime);
		System.out.println(Bobby.name);
		System.out.println(Bobby.bibNumber);
		System.out.println(Bobby.speed);
		System.out.println(Martha.name);
		System.out.println(Martha.bibNumber);
		System.out.println(Martha.speed);
	}
}
