//Write a function that takes in the radius as input and returns the circumference of a circle.


import java.util.*;
public class radi {
	public static int area(int rad){
		double pi=3.14;
		int a=(int) (2*pi*rad);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rad=sc.nextInt();

		int a= area(rad);
		System.out.print(a);
	}

}
