package eu.Senla.Task2_homework2;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	
		Rainbow mainRainbow= new Rainbow("Red", "Orange", "Yellow", "Green", "Blue", "Dark blue", "Violet");
	
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("Insert 1 color number, or 2 color numbers. Zero=exit.");
			int ColNumb=scan.nextInt();
			
			if  (ColNumb<10 && ColNumb>0) {
				switch (ColNumb) {
				case 1:
					System.out.println("it is: "+mainRainbow.getColor1());
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
					System.out.println("Wrong number, insert 1-7");
				}
			}else if(ColNumb>9) {
				switch (ColNumb) {
				case 12:
					System.out.println("it is: "+mainRainbow.getColor1()+"-"+mainRainbow.getColor2());
					break;
				case 23:
					System.out.println("it is: "+mainRainbow.getColor2()+"-"+mainRainbow.getColor3());
					break;
				case 34:
					System.out.println("it is: "+mainRainbow.getColor3()+"-"+mainRainbow.getColor4());
					break;
				case 45:
					System.out.println("it is: "+mainRainbow.getColor4()+"-"+mainRainbow.getColor5());
					break;
				case 56:
					System.out.println("it is: "+mainRainbow.getColor5()+"-"+mainRainbow.getColor6());
					break;
				case 67:
					System.out.println("it is: "+mainRainbow.getColor6()+"-"+mainRainbow.getColor7());
					break;
				default:
					System.out.println("Insert neighbour numbers");
				}
			}else if(ColNumb==0) {
				break;
			}
		}
		
}}
