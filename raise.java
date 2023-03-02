//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n

import java.util.*;
public class raise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		double x,n;
		x=sc.nextDouble();
		n=sc.nextDouble();
		double m= Math.pow(x, n);
		System.out.print(m);

	}

}
