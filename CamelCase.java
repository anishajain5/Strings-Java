package strings_challenge;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		String ans=""+str.charAt(0);
		for(int i=1; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.println(ans);
				ans=""+str.charAt(i);
			}
			else {
				ans=ans+str.charAt(i);
			}
		}
		System.out.println(ans);

	}

}
