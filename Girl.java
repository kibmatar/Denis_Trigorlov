package eu.Senla.Task1;

public class Girl {
	private String name, beauty, intellegence;
	private int age, weight, height;
	private long numberOfHairs;
	
	Girl(int age, int weight, int height, 
			String name, String intellegence, 
			String beauty, long numberOfHairs){
		this.age=age;
		this.name=name;
		this.weight=weight;
		this.height=height;
		this.intellegence=intellegence;
		this.beauty=beauty;
		this.numberOfHairs=numberOfHairs;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getIntellegence() {
		return intellegence;
	}
	public void setIntellegence(String intellegence) {
		this.intellegence=intellegence;
	}
	public String getBeauty() {
		return beauty;
	}
	public void setBeauty(String beauty) {
		this.beauty=beauty;
	}
	public long getNumberOfHairs() {
		return numberOfHairs;
	}
	public void setNumberOfHairs(long numberOfHairs) {
		this.numberOfHairs=numberOfHairs;
	}
}
