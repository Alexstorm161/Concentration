import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ConcentrationGame 

{
	static ArrayList words= new ArrayList();
	static int userNumber;
	static int userLetter;
	public static void main(String[] args) 
	{
		makeGrid();
		makeTheme();
		inputCoordinates();
	}
	public static void makeGrid()
	{
		doArrayList();
		System.out.println("----------------------");
		System.out.println("| "+words+ " | "+words+ " | "+words+" |");
		System.out.println("----------------------");
		System.out.println("| "+words+ " | "+words+ " | "+words+" |");
		System.out.println("----------------------");
		System.out.println("| "+words+ " | "+words+ " | "+words+" |");
		System.out.println("----------------------");
		System.out.println("| "+words+ " | "+words+ " | "+words+" |");
		System.out.println("----------------------");
	}
	public static void inputCoordinates()
	{
		Scanner userInput= new Scanner(System.in);
		System.out.println("Type in coordinates: (a3, b1, etc.)");
		String input=userInput.nextLine();
		String d="";
		String c="";
		String hiddenArray[][]=new String[0][0];
		switch (input.substring(0,1))
		{
		case "A":
		case "a":
			userLetter=0;
			break;
		case "B":
		case "b":
			userLetter=1;
			break;
		case "C":
		case "c":
			userLetter=2;
			break;
		case "D":
		case "d":
			userLetter=3;
			break;
		}
		System.out.println(userLetter);
		userNumber= Integer.parseInt(input.substring(1)) - 1;
	}
	public static void makeTheme()
	{
		Scanner userInput= new Scanner(System.in);
		System.out.println("Which theme do you want?");
		String input=userInput.nextLine();
		if(input.equals("1"))
		{
			
		}
		else if(input.equals("2"))
		{
				
		}
	}
	public static void repeatCode()
	{
		//runCode
	}
	public static void doArrayList()
	{
		ArrayList words= new ArrayList();
		words.add("1");
		words.add("2");
		words.add("3");
		words.add("4");
		words.add("5");
		words.add("6");
		words.add("7");
		words.add("8");
		words.add("9");
		words.add("10");
		words.add("11");
		words.add("12");
		Collections.shuffle(words);
	}
}
