package start;

import java.util.Scanner;

import Player.Player;

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
		gen.createRooms();
		Walk move = new Walk(gen.rooms);
		Room currentRoom = gen.rooms[0][0];
		Room newRoom;
		String option = "";
		int exit = 0;

		System.out.println("Du wachst auf nachdem du bewusstlos wurdest");
		System.out.println("Es sieht so aus, als ob du in einem unbewohnten Haus bist");
		System.out.println("Du musst aus dem Haus entkommen!!!");
		System.out.println("Drücke h für die Steuerung.");


		}
	}
}
