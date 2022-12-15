package brocodeOOP;

public class Constructor {

	public static void main(String[] args) {
		
		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Morty",16,50);
		Dick big = new Dick(19);
			
		human1.drink();
		human2.eat();
		big.measure();

	}

}
class Human {

	String name;
	int age;
	double weight;
	
	
	
	Human(String name,int age,double weight){
		//this. commandi bu methoddaki variablelları belirttiğini gösteriyor.
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}

class Dick {
	
	int size;
	
	Dick(int size){
		this.size = size;
		
		
	}
	void measure() {
		
		System.out.println("His dick is "+this.size+" cm long");
		
	}
}