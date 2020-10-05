package MediumLevel;
import java.util.Arrays;
import java.util.Scanner;
public class Permutation {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	if(s1.length()!=s2.length())
	{
		System.out.println("No");
	}
	else
	{
	char[] a=s1.toCharArray();
	Arrays.sort(a);
	s1=new String(a);
	// sorting string2
	char[] b=s2.toCharArray();
	Arrays.sort(b);
	s2=new String(b);
	if(s1.equals(s2))
		System.out.println("yes");
	else
		System.out.println("no");	
	}
}
}
