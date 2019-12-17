package start;

import java.util.Random;

import Item.Item;
import Monster.Monster;
import Player.Player;

/**
 * 
 * @author patrick.von-fluee Generiert R�ume, Kreaturen und Item �bergibt Die
 *         Items dem Spieler
 */
public class Generator {
	private Room[][] rooms;
	int amountX;
	int amountY;

	/**
	 * Konstruktor f�r die X und Y Pos der R�ume Neues Raum-objekt mit der angabe
	 * von X und Y
	 * 
	 * @param amountX
	 * @param amountY
	 */
	public Generator(int amountX, int amountY) {
		this.amountX = amountX;
		this.amountY = amountY;
		setRooms(new Room[amountY][amountX]);
	}

	/**
	 * 
	 * Erstellt die R�ume und schaut in welche Richtung man gehen kann und in Welche
	 * nicht Es wird geregelt per Zufall, welcher Raum erstellt wird
	 */
	public void createRooms() {
		Random rand = new Random();
		for (int y = 0; y < amountY; y++) {
			for (int x = 0; x < amountX; x++) {
				boolean north = false;
				boolean east = false;
				boolean south = false;
				boolean west = false;
				if (x > 0 && getRooms()[y][x - 1].isEast()) {
					west = true;
				}
				if (y > 0 && getRooms()[y - 1][x].isNorth()) {
					south = true;
				}
				if (x < amountX - 1) {
					int randInt = rand.nextInt(2);
					if (randInt == 1) {
						east = true;
					}
				}
				if (y < amountY - 1) {
					int randInt = rand.nextInt(2);
					if (randInt == 1) {
						north = true;
					}
				}
				if (x == 0 && y == 0) {
					north = true;
					east = true;
				}
				// �ber folgende Seite habe ich mich �ber das Zufalls-prinzip informiert
				// https://www.geeksforgeeks.org/java-util-random-nextint-java/
				int randInt = rand.nextInt(4);
				if (randInt == 1) {
					getRooms()[y][x] = new Room(north, east, south, west, x, y, createMonster());
				} else if (randInt == 2) {
					getRooms()[y][x] = new Room(north, east, south, west, x, y, createItem());
				} else if (randInt == 3) {
					getRooms()[y][x] = new Room(north, east, south, west, x, y, createMonster(), createItem());
				} else {
					getRooms()[y][x] = new Room(north, east, south, west, x, y);
				}

			}
		}
		getRooms()[rand.nextInt(5)][rand.nextInt(5)].setEnd(true);
	}

	/*
	 * Erstellt ein Monster-Objekt und gibt es zur�ck.
	 */
	public Monster createMonster() {
		Monster mon = new Monster(10, 2, "Hurensohn");
		return mon;
	}

	/*
	 * Erstellt ein Item-Objekt und gibt dieses zur�ck
	 */
	public Item createItem() {
		Item item = new Item(15, 2, "Schl�ssel");
		return item;
	}

	/*
	 * @param allItems Spiechert alle Items des SPieler Weisst dem Spieler die Items
	 * zu, die er aufgenommen hat.
	 */
	public String generateItemsToString(Player player) {
		String allItems = "";
		int counter = 0;
		for (Item item : player.getFoundItems()) {
			if (counter == 0) {
				allItems += "a " + item.getName();
				counter++;
			} else {
				allItems += ", a " + item.getName() + " ";
			}
		}
		if (allItems.equals("")) {
			allItems = "no item.";
		}

		return allItems;
	}

	public Room[][] getRooms() {
		return rooms;
	}

	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}
}
