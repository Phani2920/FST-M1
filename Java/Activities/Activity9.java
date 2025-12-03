package Activity;

import java.util.ArrayList;

public class Activity9 
{

	public static void main(String[] args)
	{
		
		ArrayList <String> myList = new ArrayList<String>();
		myList.add("Raj");
		myList.add("Ram");
		myList.add("Raghu");
		myList.add("Rama");
		myList.add("Ravan");
		myList.add(2,"Laxman");
		myList.add(4,"Bharat");
	

		
		for(String s:myList)
		{
			System.out.println(s);
		}

		System.out.println("Third Name is:"+ myList.get(6));
		System.out.println("size is:"+ myList.size());
		System.out.println("Search result:"+ myList.contains("Raj"));
		myList.remove("Ravan");
		System.out.println("size after remove functaion is:"+ myList.size());



		}
	}

