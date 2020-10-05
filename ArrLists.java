package Datastructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class ArrLists {
	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			al1.add(sc.nextInt());
		}
		int m=sc.nextInt();
		for(int i=0; i<m; i++)
		{
			al2.add(sc.nextInt());
		}
		al3.addAll(al1);
		al1.retainAll(al2);
		al3.removeAll(al1);
		al3.addAll(al2);
		Collections.sort(al3);
		Collections.sort(al1);
		Iterator it=al3.iterator();
		Iterator it1=al1.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		sc.close();	
	}
}