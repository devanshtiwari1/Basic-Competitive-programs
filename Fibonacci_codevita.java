package MediumLevel;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Fibonacci_codevita {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		ArrayList<Integer>prime=new ArrayList<Integer>();
		boolean flag;
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0 && i>2)
				continue;
			flag=true;
			for(int j=2; j*j<=i; j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				prime.add(i);
		}
		int len=prime.size();
		ArrayList<Long> comb=new ArrayList<Long>();
		for(int i=0; i<len; i++)
		{
		for(int j=0; j<len;j++)
	    {
	   	if(i!=j) {
	   long temp=Long.parseLong(Integer.toString(prime.get(i)) + Integer.toString(prime.get(j)));		
	   if(!comb.contains(temp))
		   comb.add(temp);
				}
			}
		}
		Collections.sort(comb);
		int count=-0;
		long small=2;
		long large=2;
		for(int i=0; i<comb.size(); i++)
		{
			if(isPrime(comb.get(i)))
				{
			     if(count==0)
			    	 small=comb.get(i);
			     count++;
			     large=comb.get(i);
					}
		}
		long fib[]=new long[count];
		fib[0]=small;
		fib[1]=large;
		for(int i=2;i<count;i++)
			fib[i]=fib[i-1]+fib[i-2];
		System.out.println(fib[count-1]);
}
		static boolean isPrime(long n)
		{
			if(n%2==0 && n>2)
				return false;
		  for(long i=2;i*i<=n;i++) {
			  if(n%i==0)
				  return false;
		  }
		  return true;
		  }
		}
