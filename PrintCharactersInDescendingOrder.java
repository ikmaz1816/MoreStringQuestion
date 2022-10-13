package stringQuestion;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair
{
	char data;
	int value;
	public Pair(char data,int value)
	{
		this.data=data;
		this.value=value;
	}
}
class MyComparator implements Comparator<Pair>
{
	public int compare(Pair x,Pair y)
	{
		return y.value-x.value;
	}
}
public class PrintCharactersInDescendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		PriorityQueue<Pair> pq=new PriorityQueue<>(new MyComparator());
		for(Entry<Character, Integer> e:map.entrySet())
		{
			pq.add(new Pair(e.getKey(),e.getValue()));
		}
		String p="";
		while(!pq.isEmpty())
		{
			p+=pq.peek().data;
			pq.poll();
		}
		System.out.println(p);
		sc.close();
	}

}
