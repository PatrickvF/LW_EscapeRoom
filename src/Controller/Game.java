package Controller;

import java.util.Scanner;

import Player.Player;
import start.Generator;
import start.Room;
import start.Walk;

public class Game
{

	public static void main(String[] args)
	{
		Player player = new Player();
		Scanner sc = new Scanner(System.in);
		System.out.println("Gebe bitte deinen Namen ein: ");
		player.setName(sc.nextLine());

		System.out.println("Geb bitte dein Schwierigkeitslevel an (easy, normal, hard) : ");
		String difficulty = sc.nextLine();
		Generator gen;

		switch (difficulty)
		{
		case "easy":
		{
			gen = new Generator(5, 5);
			break;
		}
		case "normal":
		{
			gen = new Generator(10, 10);
			break;
		}
		case "hard":
		{
			gen = new Generator(15, 15);
			break;
		}
		default:
		{
			gen = new Generator(10, 10);
			System.out.println("Inkorrekte Eingabe, normal wird ausgewählt");
			break;
		}

		}

		gen.createRooms();
		Walk move = new Walk(gen.getRooms());
		Room currentRoom = gen.getRooms()[0][0];
		Room newRoom;
		String option = "";
		int exit = 0;

		System.out.println("Du wachst auf nachdem du bewusstlos wurdest");
		System.out.println("Es sieht so aus, als ob du in einem unbewohnten Haus bist");
		System.out.println("Du musst aus dem Haus entkommen!!!");
		System.out.println("Drücke h für die Steuerung.");

		while (exit == 0)
		{
			System.out.print("Was willst du machen? ->  ");
			option = sc.nextLine();
			switch (option)
			{
			case "h":
			{
				System.out.println("Du kannst dich durch Räume mit n, e, s, w bewegen.");
				System.out.println("Du kannst mit c den Raum nach Items durchsuchen.");
				System.out.println("Deine Items kannst du mit i nachsehen.");
				System.out.println("Mithilfe von f kannst du nach einem Fluchtweg suchen.");
				break;
			}

			case "i":
			{
				String allItems = " " + gen.generateItemsToString(player);

				System.out.println("Du hast momentan " + allItems);
				break;
			}

			case "f":
			{
				if (player.getFoundItems().size() != 0)
				{
					if (player.getFoundItems().get(0).getName().equals("Key") && currentRoom.isEnd())
					{
						System.out.println("Du hast den Fluchtweg aufgeschlossen und bist geflohen!");
						exit = 1;
						sc.close();
					} else if (player.getFoundItems().get(0).getName().equals("Key") && !currentRoom.isEnd())
					{
						System.out.println("Du hast einen Schlüssel, aber hier ist kein Fluchtweg...");
					}
				} else
				{
					System.out.println("Du hast nichts um fliehen zu können...");
				}
				break;
			}

			case "c":
			{
				if (currentRoom.getItem() != null)
				{
					System.out.println(player.getName() + " hat einen " + currentRoom.getItem().getName() + " aufgenommen!");
					player.addItem(currentRoom.getItem());
					currentRoom.setItem(null);
				} else
				{
					System.out.println("Hier drin ist nichts...");
				}

				break;
			}
			case "n":
			{
				newRoom = move.walkNorth(currentRoom);
				if (newRoom != null)
				{
					System.out.println("nach Norden bewegt");
					currentRoom = newRoom;
				}
				else {
					System.out.println("Da ist keine Türe");
				}
				
					if (currentRoom.getMonster() != null)
					{
						System.out.println("Oh nein hier ist eine " + currentRoom.getMonster().getName() + "!");
					}
				break;
			}
				
			
			case "e":
			{
				newRoom = move.walkEast(currentRoom);
				if (newRoom != null)
				{
					System.out.println("Nach Osten bewegt");
					currentRoom = newRoom;
				}
				else {
					System.out.println("Da ist keine Türe");
				}

					if (currentRoom.getMonster() != null)
					{
						System.out.println("Oh nein hier ist eine " + currentRoom.getMonster().getName() + "!");
					}
					break;
				}
				
			
			case "s":
			{
				newRoom = move.walkSouth(currentRoom);
				if (newRoom != null)
				{
					System.out.println("Nach Süden bewegt");
					currentRoom = newRoom;
				}
				else {
					System.out.println("Da ist keine Türe");
				}
					if (currentRoom.getMonster() != null)
					{
						System.out.println("Oh nein hier ist eine " + currentRoom.getMonster().getName() + "!");
					}
					break;
				}
				
			
			case "w":
			{
				newRoom = move.walkWest(currentRoom);
				if (newRoom != null)
				{
					System.out.println("Nach Westen bewegt");
					currentRoom = newRoom;
				}
				else {
					System.out.println("Da ist keine Türe");
				}
					if (currentRoom.getMonster() != null)
					{
						System.out.println("Oh nein hier ist ein " + currentRoom.getMonster().getName() + "!");
					}
					break;
				}
				
			
			case "exit":
			{
				exit = 1;
				sc.close();
				break;
			}
			default:
			{
				System.out.println("Falsche Eingabe");
				break;
			}
			}
		}
	}

}
