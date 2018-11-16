
public class FlyingMokey extends Vehicle {

	//constructor with no field (a "no-args" constructor)
	public FlyingMokey(){
		System.out.println("called noargs constructor");
	}	

	//constructor with all the fields
	public FlyingMokey(int yearManufactured, String model, String make){
		//"this" refers to the Car object being created, NOT the argument
		this.age = age;	
		this.color =color;
		this.size = size;
	}
	
	//private instance variables, accessible only within the class	
	private int age;
	private String color;
	private String size;

	//getters and setters (accessors and mutators)
	public int getAge(){
		return this.age;
	}
	
	public String getColor(){
		return this.color;
	}

	public String getSize(){
		return this.size;
	}

	public void setAge(int Age){
		this.age = age;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setSize(String size){
		this.size = size;
	}

	//override inherited move() method 
	@Override		//doesn't DO anything, but will fail to compile if no matching superclass method
	public void move(){
		System.out.println("FlyingMokey is moving");
	}

}