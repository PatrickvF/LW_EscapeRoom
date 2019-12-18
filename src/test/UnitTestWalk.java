package test;

import org.junit.Assert;
import org.junit.Test;

import start.Room;
/**
 * Kontrolliert ob die Türen begehbar sind.
 * @author patrick.von-fluee
 *
 */
public class UnitTestWalk {
	public UnitTestWalk() {
	}
	
	/**
	 * Türen werden auf true gesetzt und sie werden kontrolliert ob sie auch dies zurückgeben.
	 */
	@Test
	public void testWalkNorth() {
		Room currentRoom = new Room(true, true, true, true, 0, 0);
		boolean doorNorth = currentRoom.isNorth();
		Assert.assertTrue(doorNorth);
	}

	@Test
	public void testWalkEast() {
		Room currentRoom = new Room(true, true, true, true, 0, 0);
		boolean doorEast = currentRoom.isEast();
		Assert.assertTrue(doorEast);
	}

	@Test
	public void testWalkSouth() {
		Room currentRoom = new Room(true, true, true, true, 0, 0);
		boolean doorSouth = currentRoom.isSouth();
		Assert.assertTrue(doorSouth);
	}

	@Test
	public void testWalkWest() {
		Room currentRoom = new Room(true, true, true, true, 0, 0);
		boolean doorWest = currentRoom.isWest();
		Assert.assertTrue(doorWest);
	}
}
