public class Main // 1.a Create a class Main with main method 
{

public static void main(String[] args)

{
Team team1 = new Team("Sussy Gambas"); // 1.g constructor with parameter
team1.setRank(1); // 1.i call the setRank() method from main
team1.addPlayer("Player 1");
team1.addPlayer("Player 2");
System.out.println(team1);

Team team2 = new Team("Icecream Guys"); // 1.k Create 5 more Team instances and print
team2.setRank(2); 
team2.addPlayer("Player 3");
team2.addPlayer("Player 4");
System.out.println(team2);

Team team3 = new Team("Wheelie Whagon");
team3.setRank(3); 
team3.addPlayer("Player 5");
team3.addPlayer("Player 6");
System.out.println(team3);

Team team4 = new Team("Team Mario");
team4.setRank(4); 
team4.addPlayer("Player 7");
team4.addPlayer("Player 8");
System.out.println(team4);

Team team5 = new Team("Team Luigi");
team5.setRank(5); 
team5.addPlayer("Player 9");
team5.addPlayer("Player 10");
System.out.println(team5);

Team team6 = new Team("Team Fortnite");
team6.setRank(6); 
team6.addPlayer("Player 11");
team6.addPlayer("Player 12");
System.out.println(team6);
}

}