package stringQuestion;

import java.util.Scanner;

public class PrintEvenLengthWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(String s:str.split(" "))
		{
			if(s.length()%2==0)
				System.out.println(s);
		}
		sc.close();
	}

}
