import java.util.ArrayList;

public class Team // 1.b entity called Team
{
	private String name; // 1.c Private instance of team name 
	private int rank; // 1.d Private instance of team rank variable
	private ArrayList<String> players; // 1.e Private instance of ArrayList holding team names


	public Team(String name) // 1.f Constructor with team name parameter 
	{
		this.name = name;
		this.players = new ArrayList<>();
	}

	public void setRank(int rank) // 1.h add a method to set the team's rank
	{
		this.rank = rank;
	}

	@Override
	public String toString()
	{	// 1.j add a toString() // 1.m adjust the toString method
		StringBuilder result = new StringBuilder("Hold: " + name + " Rang: " + rank + "navn: " + "\nSpillere:\n"); 
		for (String player : players)
		{
			result.append(player).append("\n");
		}
			return result.toString();
	}
	
		public void addPlayer(String playerName) // 1.l add addPlayer() method
		{
			players.add(playerName);
		}
	
}