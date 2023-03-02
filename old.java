//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.


import java.util.*;
public class old {
	public static int aged(int age) {
		if(age>18) {
			System.out.print("Eligible to vote since is ");
		}else {
			System.out.print("Not Eligible to vote since age is ");
		}
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		int oldage= aged(age);
		System.out.print(oldage);

	}

}
