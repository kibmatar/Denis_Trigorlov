package eu.Senla.Task2_homework2;
import java.util.*;

public class MainClass {
	final int red=1;
	final int redorange=12;
	public static void main(String[] args) {
	
		rainbow mainRainbow= new rainbow("Red", "Orange", "Yellow", "Green", "Blue", "Dark blue", "Violet");
	
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Insert color number: ");
			int ColNumb=scan.nextInt();
			
			
			switch (ColNumb) {
			case 1:
				System.out.println("it is: "+mainRainbow.getColor1());
				break;
			case 12:
				System.out.println("it is: "+mainRainbow.getColor1()+"-"+mainRainbow.getColor2());
				break;
			case 2:
				System.out.println("it is: "+mainRainbow.getColor2());
				break;
			case 3:
				System.out.println("it is: "+mainRainbow.getColor3());
				break;
			case 4:
				System.out.println("it is: "+mainRainbow.getColor4());
				break;
			case 5:
				System.out.println("it is: "+mainRainbow.getColor5());
				break;
			case 6:
				System.out.println("it is: "+mainRainbow.getColor6());
				break;
			case 7:
				System.out.println("it is: "+mainRainbow.getColor7());
				break;
			default:
				System.out.println("wrong number, insert 1-7");
			}
		}
		
}}
