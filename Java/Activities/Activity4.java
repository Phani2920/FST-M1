package Activity;

import java.util.Arrays;

public class Activity4 

{
 public static void main(String args[])
 {
	 
	 int [] cardNumbers = {98,9,6,99,1,10,23};
	 
	 sortAscendingLogic(cardNumbers);
	 System.out.println(Arrays.toString(cardNumbers));
}
 public static void sortAscendingLogic(int[] unsortedNumb)
 {
	 int size = unsortedNumb.length,i;
		 
	 for(i=1;i<size;i++)
	 {
		 int key = unsortedNumb[i];
		 int j = i-1;
		 while(j>=0 && key < unsortedNumb[j])
		 {
			 unsortedNumb[j+1] = unsortedNumb[j];
			 --j;
		 }
		 unsortedNumb[j+1] = key;
	 }
	 
 }
 
 }

