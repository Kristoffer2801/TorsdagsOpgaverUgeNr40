import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
		
		GameMenu gameMenu = new GameMenu(actions);
		
		//gameMenu.displayMenu();
		
		String userChoice = gameMenu.getAction(); // 5.d call GetACtion() method
		
		// 5.g
		int action = Integer.parseInt(userChoice);
		doAction(action);
		
		
	}
	public static void doAction(int action) // 5.e method with switch
		{
			switch(action) // 5.f switch case
			{
				case 1:
				System.out.println("Starting the game");
				break;
				case 2:
				System.out.println("Getting previous save data");
				break;
				case 3:
				System.out.println("Game paused");
				break;
				case 4:
				System.out.println("Ending game");
				break;
				default:
				System.out.println("Invalid action!");
				break;
			}
		}
}