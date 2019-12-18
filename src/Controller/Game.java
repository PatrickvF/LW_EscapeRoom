package Controller;

import java.util.Scanner;

import Player.Player;
import start.Generator;
import start.Room;
import start.Walk;

/**
 * Die Game-Klasse ist der Controller des Spiels.
 * 
 * @author patrick.von-fluee
 *
 */
public class Game {
	
	/**
	 * In der Main-Methode wird alles erstellte. 
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Instanzen werden angelegt und Eingegebener name sowie ausgew�hlte Schwierigkeit wird definiert.
		 */
		Player player = new Player();
		Scanner sc = new Scanner(System.in);
		System.out.println("Gebe bitte deinen Namen ein: ");
		player.setName(sc.nextLine());

		System.out.println("Geb bitte dein Schwierigkeitslevel an (easy, normal, hard) : ");
		String difficulty = sc.nextLine();
		Generator gen;

		switch (difficulty) {
		case "easy": {
			gen = new Generator(5, 5);
			break;
		}
		case "normal": {
			gen = new Generator(10, 10);
			break;
		}
		case "hard": {
			gen = new Generator(15, 15);
			break;
		}
		default: {
			gen = new Generator(10, 10);
			System.out.println("Inkorrekte Eingabe, normal wird ausgew�hlt");
			break;
		}

		}
		/**
		 * R�ume sowie Walk wird Instanziert.
		 */
		gen.createRooms();
		Walk move = new Walk(gen.getRooms());
		Room currentRoom = gen.getRooms()[0][0];
		Room newRoom;
		String option = "";
		int exit = 0;

		System.out.println("Du wachst auf nachdem du bewusstlos wurdest");
		System.out.println("Es sieht so aus, als ob du in einem unbewohnten Haus bist");
		System.out.println("Du musst aus dem Haus entkommen!!!");
		System.out.println("Dr�cke h f�r die Steuerung.");

		/**
		 * Switch-Case f�r alle M�glichen Eingaben
		 */
		while (exit == 0) {
			System.out.print("Was willst du machen? ->  ");
			option = sc.nextLine();
			switch (option) {
			case "h": {
				System.out.println("Du kannst dich durch R�ume mit n, e, s, w bewegen.");
				System.out.println("Du kannst mit c den Raum nach Items durchsuchen.");
				System.out.println("Deine Items kannst du mit i nachsehen.");
				System.out.println("Mithilfe von f kannst du nach einem Fluchtweg suchen.");
				break;
			}

			/*
			 * Inventar wird kontrolliert
			 */
			case "i": {
				String allItems = " " + gen.generateItemsToString(player);

				System.out.println("Du hast momentan " + allItems);
				break;
			}

			/*
			 * Fluchtweg wird kontrolliert
			 */
			case "f": {
				if (player.getFoundItems().size() != 0) {
					if (player.getFoundItems().get(0).getName().equals("Key") && currentRoom.isEnd()) {
						System.out.println("Du hast den Fluchtweg aufgeschlossen und bist geflohen!");
						exit = 1;
						sc.close();
					} else if (player.getFoundItems().get(0).getName().equals("Key") && !currentRoom.isEnd()) {
						System.out.println("Du hast einen Schl�ssel, aber hier ist kein Fluchtweg...");
					}
				} else {
					System.out.println("Du hast nichts um fliehen zu k�nnen...");
				}
				break;
			}
			
			
			/*
			 * Items werden Kontrolliert
			 */
			case "c": {
				if (currentRoom.getItem() != null) {
					System.out.println(
							player.getName() + " hat einen " + currentRoom.getItem().getName() + " aufgenommen!");
					player.addItem(currentRoom.getItem());
					currentRoom.setItem(null);
				} else {
					System.out.println("Hier drin ist nichts...");
				}

				break;
			}
			/*
			 * Bewegung nach Norden wird kontrolliert
			 */
			case "n": {
				newRoom = move.walkNorth(currentRoom);
				if (newRoom != null) {
					System.out.println("nach Norden bewegt");
					currentRoom = newRoom;
				} else {
					System.out.println("Da ist keine T�re");
				}

				if (currentRoom.getMonster() != null) {
					System.out.println("Oh nein hier ist eine " + currentRoom.getMonster().getName() + "!");
				}
				break;
			}
			
			/*
			 * Bewegung nach Osten wird kontrolliert
			 */
			case "e": {
				newRoom = move.walkEast(currentRoom);
				if (newRoom != null) {
					System.out.println("Nach Osten bewegt");
					currentRoom = newRoom;
				} else {
					System.out.println("Da ist keine T�re");
				}

				if (currentRoom.getMonster() != null) {
					System.out.println("Oh nein hier ist eine " + currentRoom.getMonster().getName() + "!");
				}
				break;
			}

			/*
			 * Bewegung nach S�den wird kontrolliert
			 */
			case "s": {
				newRoom = move.walkSouth(currentRoom);
				if (newRoom != null) {
					System.out.println("Nach S�den bewegt");
					currentRoom = newRoom;
				} else {
					System.out.println("Da ist keine T�re");
				}
				if (currentRoom.getMonster() != null) {
					System.out.println("Oh nein hier ist eine " + currentRoom.getMonster().getName() + "!");
				}
				break;
			}

			/*
			 * Bewegung nach Westen wird kontrolliert
			 */
			case "w": {
				newRoom = move.walkWest(currentRoom);
				if (newRoom != null) {
					System.out.println("Nach Westen bewegt");
					currentRoom = newRoom;
				} else {
					System.out.println("Da ist keine T�re");
				}
				if (currentRoom.getMonster() != null) {
					System.out.println("Oh nein hier ist ein " + currentRoom.getMonster().getName() + "!");
				}
				break;
			}
			/*
			 * Man verl�sst das Spiel
			 */
			case "exit": {
				exit = 1;
				sc.close();
				break;
			}
			default: {
				System.out.println("Falsche Eingabe");
				break;
			}
			}
		}
	}

}
