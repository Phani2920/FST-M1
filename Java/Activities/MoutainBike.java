package Activity;

public class MoutainBike extends Bicycle
{ 
	public int seatHeight;
	public MoutainBike(int gears, int currentSpeed, int startHeight) 
	{
		super(gears, currentSpeed);
		seatHeight = startHeight;
		}
	public void seatHeight(int newValue)
	{
		seatHeight = newValue;
	}
	   public String bicycleDesc() 
	   {
	        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	    } 


}
