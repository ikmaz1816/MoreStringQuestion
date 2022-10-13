package stringQuestion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashMap<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		sc.close();
		for(char c:map.keySet())
		{
			if(map.get(c)==1)
			{
				System.out.println(c);
				return;
			}
		}
	}

}
