package stringQuestion;

import java.util.Scanner;

public class ComparingTwoStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		sc.close();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				System.out.println("Not equal");
				return;
			}
		}
		System.out.println("Equal");
	}

}
