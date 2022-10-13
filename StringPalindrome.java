package stringQuestion;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String p="";
		for(int i=0;i<str.length();i++)
		{
			p=str.charAt(i)+p;
		}
		sc.close();
		if(p.equals(str))
		{
			System.out.println("Palindrome");
			return;
		}
		System.out.println("Not palindrome");
		
	}

}
