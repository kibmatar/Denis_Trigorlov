package eu.Senla.Task3_homework3;
import java.util.Arrays;
import java.util.Scanner;

public class Cat {
	private static String CatsName="Barsik";
	private static int CatsAge=5;
	private static int Counter=-1;
	//telo classa
	Cat(String CatsName, int CatsAge){
		this.CatsName=CatsName;
		this.CatsAge=CatsAge;
	}
	//first cycle 10 котов к сожалению создали заранее, а потом задали внутренности
	static void cycle1() {
		Cat []cats1array=new Cat[10];
		while(Counter++<9) {
			cats1array[Counter]=new Cat(CatsName,CatsAge);
//			cat1.CatsName=" default Barsik ";
			System.out.println("Kitty "+Counter+" "+CatsName+" age "+CatsAge);
		}
		Counter=0;
	}
	
	//second cycle	создаем опять 10 пустых котов заранее
	//а так же переназываем одного кота 10 раз
	void setCatsName(String CatsName) {
		this.CatsName=CatsName;
	}
	public static String getCatsName() {
		return CatsName;
	}
	void setCatsAge(int CatsAge) {
		this.CatsAge=CatsAge;
	}
	public static int getCatsAge() {
		return CatsAge;
	}
	static Cat[]cats2array=new Cat[10];
	static void cycle2() {
		for(int i=0;i<10;i++) {
			Cat catCycle2=new Cat(getCatsName(),getCatsAge());
			catCycle2.setCatsName("Fluffy");
			catCycle2.setCatsAge(7);
			cats2array[i]=new Cat(getCatsName(),getCatsAge());
			System.out.println((i+1)+" "+catCycle2.getCatsName()+" "+catCycle2.getCatsAge());
		}
	}
	
	//creating previously cats array and fillig array
	//and the same cat is being renamed
	static Cat[]cats3array=new Cat[10];
	static void cycle3() {
		do {
			Cat catCycle3=new Cat("pumponchik", 8);
			cats3array[Counter]=catCycle3;
			System.out.println(catCycle3.CatsName+" "+catCycle3.CatsAge);
		}while(Counter++<9);
		Counter=0;
	}
	
	//fourth cycle Eventually! different cats creation
	static Scanner scan=new Scanner(System.in);
	static Cat[] arrayCats4=new Cat[5];
	static void cycle4() {
		for(Cat i:arrayCats4) {
			System.out.print("insert "+(Counter+1)+"th cats name: ");
			CatsName=scan.next();
			System.out.print("insert his age: ");
			CatsAge=scan.nextInt();
			arrayCats4[Counter]=new Cat(getCatsName(),getCatsAge());
			System.out.println("it is: "+getCatsName()+" "+getCatsAge());
			Counter++;
		}
		
		for(Cat i:arrayCats4) {
			
//		System.out.println(Arrays.deepToString(i));
		}
		
	}
	
	
	
		
}
