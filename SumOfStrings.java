package stringQuestion;

import java.util.Scanner;

public class SumOfStrings {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=a+b;
		System.out.println(String.valueOf(c));
		sc.close();
	}
}
