package gridWorld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Bug blackbug = new Bug(Color.BLACK);
		Flower flower = new Flower();
		Location loc = new Location(3,3);
		//Location flowerloc = new Location(0,0);
		world.add(loc, bug);
		world.add(new Location(1,2), blackbug );
		bug.turn();
		blackbug.turn();
		bug.turn();
		blackbug.turn();
		for(int i = 0; i<10 ; i++ ) {
			for(int b = 0; i<10 ; b++) {
			Location flowerloc = new Location(i,b);
			world.add(flowerloc, new Flower());
		}
			
		}
		//bug.setColor(Color.RED);
	
		
		
	}
//public void add(Location loc Actor occupant);
	
}
