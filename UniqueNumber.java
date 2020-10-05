package MediumLevel;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class UniqueNumber {
	public static void main(String[] args)
	{ 	
        Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int u=sc.nextInt();
		int count=0;
		int sum=0;
		for(int i=l;i<=u;i++)
		{
			Set<Integer> s=new HashSet<Integer>();
			int t=i;
			count=0;
		    while(t!=0)
		    {
		        s.add(t%10);
		        count++;
		        t=t/10;
		    }
		    if(s.size()==count)
		    {
		        sum++;
		    }
		}
		    
		System.out.println(sum++);
	}
}