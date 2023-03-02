//Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.*;
public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int r=Math.min(n, m);
		while(r>0) {
			if(m%r==0 && n%r==0) {
				break;
			}
			r--;
		}
		System.out.print(r);
		

	}

}
