
public class Motorcycle extends Vehicle {

	//constructor with no field (a "no-args" constructor)
	public Motorcycle(){
		System.out.println("called noargs constructor");
	}	

	//constructor with all the fields
	public Motorcycle(int yearMade, String model, String make){
		//"this" refers to the Motorcycle object being created, NOT the argument
		this.yearMade = yearMade;	
		this.model = model;
		this.make = make;
	}
	
	//private instance variables, accessible only within the class	
	private int yearMade;
	private String model;
	private String make;

	//getters and setters (accessors and mutators)
	public int getYearMade(){
		return this.yearMade;
	}
	
	public String getModel(){
		return this.model;
	}

	public String getMake(){
		return this.make;
	}

	public void setYearMade(int year){
		this.yearMade = year;
	}

	public void setModel(String model){
		this.model = model;
	}

	public void setMake(String make){
		this.make = make;
	}

	//override inherited move() method 
	@Override		//doesn't DO anything, but will fail to compile if no matching superclass method
	public void move(){
		System.out.println("Motorcycle is moving");
	}


