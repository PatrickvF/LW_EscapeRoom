package Player;

import java.util.ArrayList;
import java.util.List;

import Item.Item;
import start.Creature;

/**
 * 
 * @author patrick.von-fluee Die Klasse ist eine Spezialisierung der Klasse
 *         Creature
 *
 */
public class Player extends Creature implements IBattle {
	/*
	 * Lege Eine Liste an für die Items die der Player aufnimmt
	 */
	private List<Item> foundItems = new ArrayList<>();

	public Player() {
		super();
	}

	public Player(String name) {
		super(name);
	}

	public Player(int hp) {
		super(hp);
	}

	public void addItem(Item item) {
		foundItems.add(item);
	}

	public String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}

	/**
	 * Getter für die foundItems Liste
	 * 
	 * @return
	 */
	public List<Item> getFoundItems() {
		return foundItems;
	}

	/**
	 * Setter für die FoundItems Liste
	 * 
	 * @param foundItems
	 */
	public void setFoundItems(List<Item> foundItems) {
		this.foundItems = foundItems;
	}

	@Override
	public void takeDamage(int dmg) {
		super.setHp(super.getHp() - dmg);
	}
}