package test;

import org.junit.Assert;
import org.junit.Test;
import start.Room;

public class UnitTestNoDoor {
	public UnitTestNoDoor() {
	}

	@Test
	public void testNoDoorNorth() {
		Room currentRoom = new Room(false, false, false, false, 0, 0);
		boolean doorNorth = currentRoom.isNorth();
		Assert.assertFalse(doorNorth);
	}

	@Test
	public void testNoDoorEast() {
		Room currentRoom = new Room(false, false, false, false, 0, 0);
		boolean doorEast = currentRoom.isEast();
		Assert.assertFalse(doorEast);
	}

	@Test
	public void testNoDoorSouth() {
		Room currentRoom = new Room(false, false, false, false, 0, 0);
		boolean doorSouth = currentRoom.isSouth();
		Assert.assertFalse(doorSouth);
	}

	@Test
	public void testNoDoorWest() {
		Room currentRoom = new Room(false, false, false, false, 0, 0);
		boolean doorWest = currentRoom.isWest();
		Assert.assertFalse(doorWest);
	}
}
