import java.util.ArrayList;

public class GameMenu // 4.a create entity class caleed GameMenu 
{
	private ArrayList<String> actions; // 4.b Private instance variable

	public GameMenu(ArrayList<String> actions) // 4.c Constructor 
	{
		this.actions = actions; // 4.d
	}
	
	public void displayMenu() // 4.h Dispplay method
	{
		System.out.println("Game Menu:");
		for (String action : actions)
		{
			System.out.println(action);
		}
	}
}