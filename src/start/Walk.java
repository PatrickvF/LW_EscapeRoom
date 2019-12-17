package start;

/**
 * 
 * @author patrick.von-fluee Klasse für das Bewegen im Spiel zwischen den Räumen
 */
public class Walk {
	Room[][] rooms;

	public Walk(Room[][] rooms) {
		this.rooms = rooms;
	}

	/**
	 * 
	 * @param currentRoom Sobald man sich nach Norden bewegt soll man in den Raum
	 *                    der auf der Y-Koordinate eins oberhalb liegt gehen
	 * @return Falls man am Rand ist und oberhalb kein Raum ist, bekommt man ein
	 *         null Raum zurück
	 */
	public Room walkNorth(Room currentRoom) {
		if (currentRoom.north) {
			return rooms[currentRoom.y + 1][currentRoom.x];
		} else {

			return null;
		}
	}

	/**
	 * 
	 * @param currentRoom Sobald man sich nach Osten bewegt soll man in den Raum der
	 *                    auf der X-Koordinate rechts von sich liegt gehen.
	 * @return Falls man am Rand ist und Rechts kein Raum ist, bekommt man ein null
	 *         Raum zurück
	 */
	public Room walkEast(Room currentRoom) {
		if (currentRoom.east) {
			return rooms[currentRoom.y][currentRoom.x + 1];
		} else {
			return null;
		}
	}

	/**
	 * 
	 * @param currentRoom Sobald man sich nach Süden bewegt soll man in den Raum der
	 *                    auf der Y-Koordinate unterhalb von sich liegt gehen.
	 * @return Falls man am Rand ist und Unten kein Raum ist, bekommt man ein null
	 *         Raum zurück
	 */
	public Room walkSouth(Room currentRoom) {
		if (currentRoom.south) {
			return rooms[currentRoom.y - 1][currentRoom.x];
		} else {
			return null;
		}
	}

	/**
	 * 
	 * @param currentRoom Sobald man sich nach Westen bewegt soll man in den Raum
	 *                    der auf der X-Koordinate links von sich liegt gehen.
	 * @return Falls man am Rand ist und Links kein Raum ist, bekommt man ein null
	 *         Raum zurück
	 */
	public Room walkWest(Room currentRoom) {
		if (currentRoom.west) {
			return rooms[currentRoom.y][currentRoom.x - 1];
		} else {
			return null;
		}
	}
}
