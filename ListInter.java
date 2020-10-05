package MediumLevel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class ListInter {
	public static void main(String args[])
	{  Scanner sc=new Scanner(System.in);
		Map<Integer, Integer>map=new TreeMap<>();
		int arr[]=new int[5];
		for(int i=0; i<5; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<5; i++)
		{
			map.put(arr[i],i);
		}
		System.out.println(map);
	}
	}

