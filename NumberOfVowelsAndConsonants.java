package stringQuestion;

import java.util.Scanner;

public class NumberOfVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int countVowels=0,countConsonants=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='O' || str.charAt(i)=='I' || str.charAt(i)=='U')
				countVowels++;
			else
				countConsonants++;
		}
		System.out.println(countVowels+" "+countConsonants);
		sc.close();
	}

}
