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
}
	