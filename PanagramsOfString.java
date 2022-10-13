package stringQuestion;

import java.util.Scanner;

public class PanagramsOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		for(char i='a';i<='z';i++)
		{
			if(s.indexOf(i)<0)
			{
				System.out.println("Not panagram");
				return;
			}
		}
		System.out.println("panagram");
	}

}
