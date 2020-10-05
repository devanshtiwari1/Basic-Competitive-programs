package MediumLevel;

import java.util.Scanner;
import java.util.*;
class P 
{
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	         String zero="000000";
	         
	        String hh="23";
	        String mm="59";
	        String ss="59";
	       
	       String Start=n1+zero;
	       String End=n1+hh+mm+ss;
	       int end=Integer.parseInt(End);
	       int start=Integer.parseInt(Start);
	       System.out.println(Start); 
	       System.out.println(End);
	       int count=0;
	       
	       for(int i=start;i<=end;i++)
	       {
	           String AA=String.valueOf(i);
	             
	                 char ch[]=AA.toCharArray();  
	                  String rev="";
	                 for(int j=ch.length-1;j>=0;j--)
	                 {  
	                rev+=ch[j];  
	                }
	                
	                if(rev.equals(AA))
	                {
	                    count++;
	                }
	              rev="";  
	       }
	       int value= count*(n2-n1+1);
	       System.out.println(value);
	       
	    }
	}