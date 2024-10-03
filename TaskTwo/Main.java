import java.util.Scanner;

public class Main // 2.a Main Class
{

public static void main(String[] args) // 2.a main method
{

	System.out.println("Please type your name:"); // 2.b
	Scanner scanner = new Scanner(System.in); // 2.c Scanner
	String name = scanner.nextLine(); // 2.d declare string variable which contains return
	System.out.println("Hello " + name + " Please type your age:"); // 2.e greeting user
	int age = scanner.nextInt(); // 2.f Declare int var and assign input
	System.out.println("You are " + age + " years old."); // 2.g print user age
	int yearsToRetirement = 67 - age;
	System.out.println("You have " + yearsToRetirement + " years until retirement");
}


}