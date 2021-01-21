//snake case
//anboxing,boxing,autoboxing
package eu.Senla.Task2;


public class SuperMain {
	
	static int mainValue=3;
	
	public static void main (String[] args) {
		
		Counter firstCounter=new Counter();
		firstCounter.setFirstField(10);
		System.out.println(firstCounter.getFirstField());
	
		
		int a=3;
		int b=5;
		int c=++a;
		System.out.println(a+" "+c);
		System.out.println(Math.max(a, b));
//		Integer wrapper=new Integer(value:0);
//		Integer val123=123;
		
		switch(a) {
		case 4:
			System.out.println("1");
			a=7;
			break;
		case 7:
			System.out.println("7");
			break;
		default:
			System.out.println("def");
		
		
		}
	}
}
