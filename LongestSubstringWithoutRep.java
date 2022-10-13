package stringQuestion;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashSet<Character> hs=new HashSet<>();
		String max="",p="";
		for(int i=0;i<str.length();i++)
		{
			if(hs.contains(str.charAt(i)))
			{
				if(max.length()<p.length())
				{
					max=p;
				}
				p="";
				hs.clear();
			}
			hs.add(str.charAt(i));
			p+=str.charAt(i);
		}
		System.out.println(max);
		sc.close();
	}
}
