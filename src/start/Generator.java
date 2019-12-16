package start;

import java.util.Random;

import Item.Item;
import Monster.Monster;
import Player.Player;
/**
 * 
 * @author patrick.von-fluee
 * Generiert Räume, Kreaturen und Item
 * Übergibt Die Items dem Spieler
 */
public class Generator
{
	Room[][] rooms;
	int amountX;
	int amountY;
	
	/**
	 * Konstruktor für die X und Y Pos der Räume
	 * Neues Raum-objekt mit der angabe von X und Y
	 * @param amountX
	 * @param amountY
	 */
	public Generator(int amountX, int amountY)
	{
		this.amountX = amountX;
		this.amountY = amountY;
		rooms = new Room[amountY][amountX];
	}
	/**
	 * 
	 * Erstellt die Räume und schaut in welche Richtung man gehen kann und in Welche nicht
	 * Es wird geregelt per Zufall, welcher Raum erstellt wird
	 */
	public void createRooms()
	{
		Random rand = new Random();
		for (int y = 0; y < amountY; y++)
		{
			for (int x = 0; x < amountX; x++)
			{
				boolean north = false;
				boolean east = false;
				boolean south = false;
				boolean west = false;
				if (x > 0 && rooms[y][x - 1].isEast())
				{
					west = true;
				}
				if (y > 0 && rooms[y - 1][x].isNorth())
				{
					south = true;
				}
				if (x < amountX - 1)
				{
					int randInt = rand.nextInt(2);
					if (randInt == 1)
					{
						east = true;
					}
				}
				if (y < amountY - 1)
				{
					int randInt = rand.nextInt(2);
					if (randInt == 1)
					{
						north = true;
					}
				}
				if (x == 0 && y == 0)
				{
					north = true;
					east = true;
				}
				

			}
		}

		rooms[0][0].setEnd(true);
	}
}
	