//Find the maximum & minimum number in an array of integers. 
//[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

import java.util.*;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int size = sc.nextInt();
	      int numbers[] = new int[size];


	      //input
	      for(int i=0; i<size; i++) {
	          numbers[i] = sc.nextInt();
	      }


	      int max = Integer.MIN_VALUE;
	      int min = Integer.MAX_VALUE;
	     
	       for(int i=0; i<numbers.length; i++) {
	           if(numbers[i] < min) {
	               min = numbers[i];
	           }
	           if(numbers[i] > max) {
	               max = numbers[i];
	           }
	       }
	       System.out.println("Largest number is : " + max);
	       System.out.println("Smallest number is : " + min);

	}

}
