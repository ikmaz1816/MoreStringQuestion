package stringQuestion;

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		if(isAnagram(str1,str2))
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
		sc.close();
	}

	private static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		int[] arr=new int[256];
		for(int i=0;i<str1.length();i++)
		{
			arr[str1.charAt(i)]++;
			arr[str2.charAt(i)]--;
		}
		for(int i=0;i<256;i++)
		{
			if(arr[i]!=0)
				return false;
		}
		return true;
	}
}
