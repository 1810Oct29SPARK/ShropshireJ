public class Driver {
 	public static void main(String[] args) {
		//Make some cars
		Car myCar = new Car(2016,"Elantra","Hyundai");
		Car myOtherCar = new Car(2018,"Model M","Tesla");
		myCar.setMilesSinceOilChange(100);
		if (myCar.getMilesSinceOilChange() >= Car.milesBetweenOilChanges){
			System.out.println("Time to change the oil");
		} else {
			int milesLeft = Car.milesBetweenOilChanges - myCar.getMilesSinceOilChange();
			System.out.println("You have "+milesLeft+" miles left");
		}
		FlyingMonkey monkey = new FlyingMonkey(15, "brown", "BigAsHell");

		monkey.move();
		monkey.Flying();
		 System.out.println(" my age  " + monkey.getAge() + " my color is " 
		 					+ monkey.getColor() + " and i am" + monkey.getSize());

		Motorcycle bike = new Motorcycle();
		bike.move();
	}
 	public static void init(){
		
		System.out.println("this is the point of entry into my program");
		
 		//make a car object with no set fields
 		//declare the variable carOne and assign a new Car to it
 		Car carOne = new Car();
 		//toString is a method inherited from Object
 		System.out.println("carOne: "+carOne.toString());
 		
 		//make a car object with instance variables set in the constructor
 		//declare the variable CarTwo and assign an new Car to it
 		Car carTwo = new Car(1972,"DeLorean","DMC");
 		//check out the toString result
 		System.out.println("carTwo: "+carTwo.toString());
 	
 		//try to view instance variables of carTwo
 		//this does NOT COMPILE		System.out.println(carTwo.model);
 		System.out.println("model of carTwo: "+carTwo.getModel());
 		
 		//reset the model of carTwo
 		carTwo.setModel("NotDeLorean");
 		System.out.println("model of carTwo: "+carTwo.getModel());
 	
 		//test out carTwo's inherited move() method
 		carTwo.move();
 		
 		//declared a variable garage which is an  array of Vehicles
 		//created an empty array with five elements and assigned it to garage
 		Vehicle[] garage =  new Vehicle[5];
 		//add vehicles to array
 		garage[0] = carOne;
 		garage[1] = new Boat("The Black Pearl","black");
 		garage[2] = new Car(1880,"Horse","Horse");
 		garage[3] = carTwo;
 		garage[4] = new Boat("Boaty McBoatface","green");
 		for (int i=0; i < garage.length; i++) {
 			garage[i].move();
 		}
 	}
 
 }
 
