import java.util.ArrayList;

public class Main // 4.e client class
{
	public static void main(String[] args)
	{
		ArrayList<String> actions = new ArrayList<>(); // 4.f Arraylist called actions
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
		
		GameMenu gameMenu = new GameMenu(actions); // 4.g instantiate the GameMenu class with actions list
		
		gameMenu.displayMenu(); // 4.i thest the displayMenu() method
	}
}