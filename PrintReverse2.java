package stringQuestion;

import java.util.Scanner;

public class PrintReverse2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]+" ");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
