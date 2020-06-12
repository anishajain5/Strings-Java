package strings_challenge;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		int left=0;
		int right= str.length()-1;
		System.out.println(palindrome(str, left, right));

	}
	
	public static boolean palindrome(String str, int left, int right) {
		if(str.length()==0||str.length()==1) {
			return true;
		}
		if(left>right) {
			return true;
		}
		if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		
		palindrome(str, left+1, right-1);
		return true;
	}

}
