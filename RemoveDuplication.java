package MediumLevel;
import java.util.*;
public class RemoveDuplication {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String a = sc.nextLine();
		String s1[]=a.split("\\s+");
		Set<String> h=new LinkedHashSet<>();
		for(int i=0; i<s1.length; i++)
		{
			h.add(s1[i]);
		}
		//System.out.println(h);
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
