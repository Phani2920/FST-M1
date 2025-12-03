package Activity;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
	public static void main(String[] args)
	{
        Set<String> hs = new HashSet<String>();
        hs.add("Me");
        hs.add("you");
        hs.add("He");
        hs.add("she");
        hs.add("Me");
        hs.add("It");
        hs.add("she");
        
        System.out.println("size is "+ hs.size());
        System.out.println("Original HashSet: " + hs);
        System.out.println("Removing It from HashSet: " + hs.remove("It"));
        System.out.println("size is "+ hs.size());

    	
        if(hs.remove("It")) {
        	System.out.println("It removed from the Set");
        } else {
        	System.out.println("It is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if she is present: " + hs.contains("she"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);

	}

}
