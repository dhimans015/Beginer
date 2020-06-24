package algorithms;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
				
		System.out.println("Sum: "+sum(n));
	}
		static int sum(int n) {
			if(n==1)
				return n;
			else
				return n+ sum(n-1);
		}
	}
