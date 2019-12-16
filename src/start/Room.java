package start;

import Item.Item;
import Monster.Monster;
/**
 * 
 * @author patrick.von-fluee
 * Die Klasse Raum erstellt die Räume die nacher in der Generatorklasse generiert werden
 *
 */
public class Room
{
	boolean north;
	boolean east;
	boolean south;
	boolean west;
	boolean end = false;
	int x;
	int y;
	Monster monster;
	Item item;
}