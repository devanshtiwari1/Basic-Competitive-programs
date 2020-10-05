package Datastructure;
import java.io.*;
public class knapsack {
	static int max(int a,int b)
	{
		return (a>b) ? a : b;
	}
	static int Knapsack(int val[],int wt[], int w ,int n)
	{
		if(n==0 || w==0)
			
			return 0;
		
		if(wt[n-1]<=w)
			
			return max(val[n-1] + Knapsack(val,wt,w-wt[n-1],n-1),Knapsack(val,wt,w,n-1));
		
		else if(wt[n-1]>w)
			
			return Knapsack(val,wt,w,n-1);
		return 0;
	}

public static void main(String args[])
{
	int val[]=new int[] { 30,10,60,90,50 };
	int wt[]=new int[] { 2,1,4,8,3 };
	int w=11;
	int n=val.length;
	System.out.println(Knapsack(val,wt,w,n)); 
}
}
