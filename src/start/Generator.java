package start;

import java.util.Random;

import Item.Item;
import Monster.Monster;
import Player.Player;
/**
 * 
 * @author patrick.von-fluee
 * Generiert R�ume, Kreaturen und Item
 * �bergibt Die Items dem Spieler
 */
public class Generator
{
	Room[][] rooms;
	int amountX;
	int amountY;
	
	/**
	 * Konstruktor f�r die X und Y Pos der R�ume
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
	