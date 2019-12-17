package Monster;

import Player.IBattle;
import start.Creature;

/**
 * Monster Klasse ist eine Spezialisierung der Creature Klasse Die Klasse soll
 * die Gegner in den einzelnen Räumen darstellen
 * 
 * @author patrick.von-fluee
 *
 */
public class Monster extends Creature implements IBattle {
	private int att;

	/**
	 * Konstruktor für die Monster
	 * 
	 * @param hp
	 * @param att
	 * @param name
	 */
	public Monster(int hp, int att, String name) {
		super(name, hp);
		this.att = att;
	}

	/**
	 * Getter für HP
	 */
	public int getHp() {
		return super.getHp();
	}

	/**
	 * Setter für HP in der Basisklasse
	 */
	public void setHp(int hp) {
		super.setHp(hp);
	}

	/**
	 * Getter für die Attacke
	 * 
	 * @return
	 */
	public int getAtt() {
		return att;
	}

	/**
	 * Setter für die Attacke
	 * 
	 * @param att
	 */
	public void setAtt(int att) {
		this.att = att;
	}

	/**
	 * Getter für den Namen in der Basisklasse
	 */
	public String getName() {
		return super.getName();
	}

	/**
	 * Setter für den Namen in der Basisklasse
	 */
	public void setName(String name) {
		super.setName(name);
	}

	/**
	 * Die takeDamage funktion ist für das Interface, über welche nacher eine
	 * Kampffunktion gehen sollte.
	 */
	@Override
	public void takeDamage(int dmg) {
		super.setHp(super.getHp() - dmg);
	}
}