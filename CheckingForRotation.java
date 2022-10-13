package stringQuestion;

import java.util.Scanner;

public class CheckingForRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rotation=sc.next();
		String s1=s + s;
		if(s1.contains(rotation))
		{
			System.out.println("Is Rotation");
		}
		else
		{
			System.out.println("Not a rotation");
		}
		sc.close();
	}

}
