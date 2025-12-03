package Activity;

public class Activity7 

{
	public static void main(String args[]) 
	{
	    MoutainBike mb = new MoutainBike(3, 30, 10);
	    System.out.println(mb.bicycleDesc());
	    mb.speedUp(5);
	    mb.applyBrake(5);
	}
}
