package test;

import org.junit.Assert;
import org.junit.Test;
import start.Room;
/**
 * UnitTestNoDoor 
 * Unittests der Kontrolliert, ob man sich nicht durch Türen bewegen 
 * @author patrick.von-fluee
 *
 */
public class UnitTestNoDoor {
	public UnitTestNoDoor() {
	}
	/**
	 * Setzt Alles Türen auf false, und kontrolliert ob jeweilige Türe auch false ausgibt.
	 */
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
