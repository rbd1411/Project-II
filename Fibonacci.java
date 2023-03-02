//Write a program to print Fibonacci series of n terms where n is input by user :0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int m;
		
		int n=sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++) {
			m=a+b;
			System.out.print(m+" ");
			a=b;
			b=m;
		}
		
	}

}
