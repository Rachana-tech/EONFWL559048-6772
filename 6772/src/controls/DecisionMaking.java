package controls;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks:");
		marks= sc.nextInt();
		if(marks>=36)
		{
			System.out.println("u r passed");
		}
		else
		{
			System.out.println("u r not passed");
		}
	}

}
