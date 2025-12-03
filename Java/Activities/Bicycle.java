package Activity;

public class Bicycle implements BicycleOperations,BicycleParts

{
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears,int currentSpeed)
	{
		this.gears =  gears;
		this.currentSpeed = currentSpeed;
	}
	
	
	public void applyBrake(int decrement)
	{
		System.out.println("Currentspeed: " + currentSpeed);
		currentSpeed -= decrement;
		System.out.println("Break.Current speed: " + currentSpeed);
	}
	public void speedUp(int increment)
	{
		System.out.println("Currentspeed: " + currentSpeed);
		currentSpeed += increment;
		System.out.println("Peddeledup.Current speed: " + currentSpeed);
	}
		
	public String bicycleDesc() 
	{
	    return("No of gears are "+ gears +"\nmax Speed of bicycle is " + maxSpeed);
	}
	
}
