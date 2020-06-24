package algorithms;

public class Palindrome {

	public static void main(String[] args) {
		String s="abbaa";
		if(ispalindrome(s)) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}
	public static boolean ispalindrome(String s) {
		if(s.length()==0||s.length()==1) 
			return true;
		if(s.charAt(0)==s.charAt(s.length()-1))
			return ispalindrome(s.substring(1,s.length()-1));
		else
			return false;
			
		
	}

}
