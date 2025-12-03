package Activity;

public class Activity6
{
 public static void main(String[] args) throws InterruptedException
 {
	 Plane plane = new Plane(2);
	 plane.onboard("Kiran");
	 plane.onboard("Varun");
	 plane.onboard("Garun");
	 plane.onboard("Duran");
	 plane.onboard("Charan");
	 plane.onboard("Raj");
	 plane.onboard("Kaj");
	 plane.onboard("Waj");
	 plane.onboard("Waj");
	 plane.onboard("Waj");
	 plane.onboard("Waj");
	 plane.onboard("Waj");
	 plane.onboard("Waj");

	 System.out.println("Plain Takeoff at: "+ plane.takeOff());
	 System.out.println("Passenegers on the plan: "+ plane.getPassesngers());
	 
	 Thread.sleep(1000);
	 
	 plane.land();
	 
	 System.out.println("Plain Takeoff at: "+ plane.getLastTimeLanded());
	 System.out.println("People on the plane after landing: " + plane.getPassesngers());



	 
 }
	
}
