package eu.Senla.Task4_homework4;

public class subclass1 {
	
	private static String str1="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	private static int numb1;
	private static int randInt;
	
	public static void matrix() {
		
		char[][]matrix=new char[10][10];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				for(int f=0;f<6;f++) {
				randInt=(int) (Math.random()*51);
				System.out.print(matrix[i][j]=str1.charAt(randInt));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
}
}
