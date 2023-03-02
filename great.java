//Write a function which takes in 2 numbers and returns the greater of those two

import java.util.*;
public class great {
	public static int greater(int a, int b){
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
			

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int a=sc.nextInt();
        int b=sc.nextInt();
        
        int big=greater(a,b);
        System.out.println(big);

	}

}
