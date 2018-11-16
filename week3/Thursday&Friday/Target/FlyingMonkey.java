
public class FlyingMonkey extends Vehicle {
    //private instance variables, accessible only within the class	
	private int age;
    private String size;
    private String color;


	//constructor with no field (a "no-args" constructor)
	public FlyingMonkey(){
		System.out.println("called noargs constructor");
	}	

	//constructor with all the fields
	public FlyingMonkey(int age, String color, String size){
		//"this" refers to the Car object being created, NOT the argument
		this.age = age;	
		this.color = color;
		this.size = size;
	}
	

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
        System.out.println("FlyingMonkey is moving");
	}
    public void Flying(){
        System.out.println( "FlyingMonkey is Flying");
    }
}