package start;

import Item.Item;
import Monster.Monster;

/**
 * 
 * @author patrick.von-fluee Die Klasse Raum erstellt die R�ume die nacher in
 *         der Generatorklasse generiert werden. Hier weden die "Art" der R�ume
 *         festgelegt und was Sie beinhalten.
 *
 */
public class Room {
	boolean north;
	boolean east;
	boolean south;
	boolean west;
	boolean end = false;
	int x;
	int y;
	Monster monster;
	Item item;

	/**
	 * 
	 * @param north
	 * @param east
	 * @param south
	 * @param west
	 * @param x
	 * @param y
	 * @param monster
	 * @param item    Konstruktor f�r einen Raum mit Monster und Items
	 */
	public Room(boolean north, boolean east, boolean south, boolean west, int x, int y, Monster monster, Item item) {
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
		this.monster = monster;
		this.item = item;
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @param north
	 * @param east
	 * @param south
	 * @param west
	 * @param x
	 * @param y
	 * @param item  Konstruktor der zus�tzlich nur Items enth�lt
	 */
	public Room(boolean north, boolean east, boolean south, boolean west, int x, int y, Item item) {
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
		this.item = item;
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @param north
	 * @param east
	 * @param south
	 * @param west
	 * @param x
	 * @param y
	 * @param monster Konstruktor der zus�tzlich nur Monster enth�lt
	 */
	public Room(boolean north, boolean east, boolean south, boolean west, int x, int y, Monster monster) {
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
		this.monster = monster;
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @param north
	 * @param east
	 * @param south
	 * @param west
	 * @param x
	 * @param y     Konstruktor der weder Items noch Monster enth�lt
	 */
	public Room(boolean north, boolean east, boolean south, boolean west, int x, int y) {
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @return Schaut ob Norden True oder False ist
	 */
	public boolean isNorth() {
		return north;
	}

	/**
	 * 
	 * @return Schaut ob Osten True oder False ist
	 */
	public boolean isEast() {
		return east;
	}

	/**
	 * 
	 * @return Schaut ob S�den True oder False ist
	 */
	public boolean isSouth() {
		return south;
	}

	/**
	 * 
	 * @return Schaut ob Westen True oder False ist
	 */
	public boolean isWest() {
		return west;
	}

	/**
	 * 
	 * @return Getter f�r das Monster
	 */
	public Monster getMonster() {
		return monster;
	}

	/**
	 * @param monster Setter f�r das Monster
	 */
	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	/**
	 * Getter F�r das Item
	 * 
	 * @return
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * Setter f�r das Item
	 * 
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * Gibt das Ende als Boolean zur�ck
	 * 
	 * @return
	 */
	public boolean isEnd() {
		return end;
	}

	/**
	 * Setzt das Ende
	 * 
	 * @param isEnd
	 */
	public void setEnd(boolean isEnd) {
		this.end = isEnd;
	}
}