package eu.Senla.Task1;

public class Main {
	
	static float aFloat=22.3F;
	final static double Pi=3.1415926535;
	
		public static void main(String[] args) {
			//int age, int weight, int height, 
			//String name, String intellegence, String beauty
			//long numberOfHairs
			Girl Dasha=new Girl(16, 65, 150, "Dasha", "intellect sredniy", "krasota srednyaia", 2147483648L);
			String DashaDetails=Dasha.getName()+", "+Dasha.getBeauty()+
					", "+Dasha.getIntellegence()+", Age is "+Dasha.getAge()+
					", dlinna "+Dasha.getHeight()+", kg "+Dasha.getWeight()
					+", number of hairs is: "+Dasha.getNumberOfHairs();
			System.out.println(DashaDetails);
		
		byte x=4;
		byte y=10;
		byte z=(byte)(x+y); 
		
		Integer number=x+y;
		System.out.println(number.MAX_VALUE+" "+number.MIN_VALUE);
		System.out.println(number.toString());
		System.out.println(Float.MAX_VALUE+" "+Double.MIN_VALUE);
		String str=number.toString();
		
	//	int XXXnumber=Long.parseLong(str); //не присваевает лонг в инт
		int XXXnumber=Byte.parseByte(str); //а байт в инт-легко
		System.out.println("int XXXnumber is: "+XXXnumber);
		}
	static void setMany(int many){
		many=many;
		if(many>100) {
			System.out.println("more than hundreed");
		}
	}
	static int getMany(){
		return many;
	}
	static int many=200;
}
