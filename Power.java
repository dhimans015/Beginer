package algorithms;

import java.util.Scanner;

public class Power {
	

	public static void main(String[] args) {
		System.out.print("Enter Number: ");
		System.out.println(pow(3,1000));
		//Scanner sc = new Scanner(System.in);
	    //int n=sc.nextInt();
	   // sc.close();
		
	}
	static int pow(int a,int b) {
		System.out.println(b);
		if(b==0)
			return 1;
		if(b%2==0)
			return pow(a*a,b/2);
		else
			return a*pow(a,b-1);
	}

}
