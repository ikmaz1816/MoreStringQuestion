package stringQuestion;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(String s:str.split(" "))
		{
			System.out.println(s);
			count++;
		}
		System.out.println(count);
		sc.close();

	}

}
