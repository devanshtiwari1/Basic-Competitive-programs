package MediumLevel;
import java.util.Arrays;
import java.util.Scanner;
public class Sortbyorder {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	for(int i=0;i<n;i++)
	{
		if(i<k)
	  System.out.print(arr[i]+" ");
	}
			for(int j=n-1;j>=k;j--)
			{  if(j>=k)
				 System.out.print(arr[j]+" ");
			sc.close();
			} } }
