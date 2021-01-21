package eu.Senla.Task2_homework2;
import java.util.*;

public class Rainbow {
	
//	final private int colRed1=1;
//	final private int colOrange2=2;
//	final private int colYellow3=3;
//	final private int colGreen4=4;
//	final private int colBlue5=5;
//	final private int colDarkblue6=6;
//	final private int colViolet7=7;
	private  String color1;
	private  String color2;
	private  String color3;
	private  String color4;
	private  String color5;
	private  String color6;
	private  String color7;
	
	
//	final private String[]ColorsArray= {"red","orange","yellow","green","blue","darkblue","violet"};
//	Rainbow againRainbow=new Rainbow(ColorsArray[colorsNumber]);
//	
//	void defineColor() {
//		Scanner scan2=new Scanner(System.in);
//		System.out.print("Insert color: ");
//		int colorsNumber=scan2.nextInt();
//		while(colorsNumber<10)
//			if (colorsNumber<=(ColorsArray.length-1) && colorsNumber>0) {
//				System.out.println(ColorsArray[colorsNumber]);
//				colorsNumber=scan2.nextInt();
//			}else {
//				System.out.println("insert correct number");
//				colorsNumber=scan2.nextInt();
//			}
//	}
	
	
	Rainbow(String color1, String color2, String color3, 
			String color4, String color5, String color6,
			String color7){
		this.color1=color1;
		this.color2=color2;
		this.color3=color3;
		this.color4=color4;
		this.color5=color5;
		this.color6=color6;
		this.color7=color7;
	}
	
//	Rainbow mainRainbow2= new Rainbow("Red", "Orange", "Yellow", "Green", "Blue", "Dark blue", "Violet");
	
	public void setColor1(String color1) {
		this.color1=color1;
	}
	public String getColor1() {
		return color1;
	}
	public void setColor2(String color2) {
		this.color2=color2;
	}
	public String getColor2() {
		return color2;
	}
	public void setColor3(String color3) {
		this.color3=color3;
	}
	public String getColor3() {
		return color3;
	}
	public void setColor4(String color4) {
		this.color4=color4;
	}
	public String getColor4() {
		return color4;
	}
	public void setColor5(String color5) {
		this.color5=color5;
	}
	public String getColor5() {
		return color5;
	}
	public void setColor6(String color6) {
		this.color6=color6;
	}
	public String getColor6() {
		return color6;
	}
	public void setColor7(String color7) {
		this.color7=color7;
	}
	public String getColor7() {
		return color7;
	}
	
	
}
