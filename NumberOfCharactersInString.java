package stringQuestion;

import java.util.Scanner;

public class NumberOfCharactersInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(String s:str.split(" "))
		{
			System.out.println(s+"->"+s.length());
		}
		sc.close();
	}

}
