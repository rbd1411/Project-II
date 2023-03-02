//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;
public class counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * int n=sc.nextInt(); int x=0; int y=0; int z=0;
		 * 
		 * for(int i=-n;i<=n;i++) { if(i>0) { x=x+1; }else if(i<0) { y=y+1; }else
		 * if(i==0) { z=z+1; }else { System.out.print("Invalid"); }
		 * 
		 * } System.out.print("positive "+x+" negetive "+y+" zero "+z);
		 */
		int number,          
        countPositive = 0, 
        countNegative = 0,
        countZero = 0;

    char choice;

    do
    {
        System.out.print("Enter the number ");
        number = sc.nextInt();

        if(number > 0)
        {
            countPositive++;
        }
        else if(number < 0)
        {
            countNegative++;
        }
        else
        {
            countZero++;
        }

        System.out.print("Do you want to continue y/n? ");
        choice = sc.next().charAt(0);

    }while(choice=='y' || choice == 'Y');

    System.out.println("Positive numbers: " + countPositive);
    System.out.println("Negative numbers: " + countNegative);
    System.out.println("Zero numbers: " + countZero);
	}

}
