package stringQuestion;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack<Character> s=new Stack<>(); 
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
				s.push(str.charAt(i));
			else
			{
				if((str.charAt(i)==')' && s.peek()=='(') || (str.charAt(i)==']' && s.peek()=='[') || (str.charAt(i)=='}' && s.peek()=='{'))
					s.pop();
				else
					break;
			}
		}
		sc.close();
		if(s.isEmpty())
		{
			System.out.println("Balanced");
			return;
		}
		System.out.println("Not Balanced");
	}

}
