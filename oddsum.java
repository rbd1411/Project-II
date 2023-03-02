//Write a function to print the sum of all odd numbers from 1 to n.


import java.util.*;

public class oddsum {
	
	public static int calsum(int n){
		int sum=0;
        for(int i=1;i<=n;i++) {
        	if((i%2) != 0) {
        	sum=sum+i;
        }
        
        }
        
    return sum;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int sum=calsum(n);
        System.out.print(sum);
	}

}