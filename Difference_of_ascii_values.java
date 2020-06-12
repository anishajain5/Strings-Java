package strings_challenge;

import java.util.Scanner;

public class Difference_of_ascii_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		String ans=""+str.charAt(0);
		for(int i=1;i<str.length();i++) {
			char c1=str.charAt(i-1);
			char c2=str.charAt(i);
			int a1=(int)c1;
			int a2=(int)c2;
			int d=a2-a1;
			ans=ans+d+c2;
		}
		System.out.println(ans);
	}

}
