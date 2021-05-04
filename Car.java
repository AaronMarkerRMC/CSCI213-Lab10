/**
 * Lab 10 Car class
 * @author Aaron L Marker
 *
 */
 //Implements a car class that represents a more specific vehicle that contains 
 //information for doors and number of passengers
 
public class Car extends Vehicle{
	
	private int numOfDoors;
	private int numOfPassengers;
	
	//main
	//Tests car class
	public static void main(String args[]){
		Car myCar = new Car("F", "P", "t", 3, 57);
		Car myCar2 = new Car("F", "P", "t", 3, 57);
		System.out.print(myCar.toString());
		System.out.print(myCar.equals(myCar2));
	}
	
	//parameterized constructor
	public Car(String aMake, String aModel, String aPlate, int aDoorNum, int aPassengerNum) {
		super(aMake, aModel, aPlate);
		this.numOfDoors = aDoorNum;
		this.numOfPassengers = aPassengerNum;
	}
	
	// gets doors as int
	public int getDoors() {
		return this.numOfDoors;
	}
	
	// gets passengers as int
	public int getPassengers() {
		return this.numOfPassengers;
	}
	
	// return string representation of Car
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.", this.numOfDoors, super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	
	public boolean equals(Object other) {
		
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(super.equals(otherCar) && this.numOfDoors == otherCar.getDoors() && this.numOfPassengers == otherCar.getPassengers()) {
			return true;
		}
		
		return false;
	}
	
	public Car copy(Car car){
		Car newCar = new Car(super.getMake(), super.getModel(), super.getPlate(), this.numOfDoors, this.numOfPassengers);
		return newCar;
	}

}
