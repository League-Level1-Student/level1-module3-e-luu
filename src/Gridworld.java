import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

	public static void main(String[] args) {
		World world = new World();
		Location lo = new Location(5, 5);
		Random randy = new Random();
		int ran = randy.nextInt(10);
		Location loc = new Location(ran, ran);
		Location l = new Location(5, 4);
		Location loca = new Location(5, 6);
	
		Bug bugg = new Bug(Color.BLUE);
		Bug bug = new Bug();
		Flower flo = new Flower();
	bug.canMove();
		world.show();
		world.add(lo, bug);
		world.add(loc, bugg);
		bug.act();
		bug.act();
		world.add(loca, flo);
		world.add(l, flo);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Location locat = new Location(i,j);
				world.add(locat, flo);
			}
		}
	}
}
