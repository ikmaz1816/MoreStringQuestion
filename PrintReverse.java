package stringQuestion;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
		sc.close();
	}

}
