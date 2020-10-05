package MediumLevel;

import java.util.Scanner;

public class R {
	static int check(int n) 
    { String store=String.valueOf(n);
        int rev = 0; 
        for (int i = n; i >= 0; i /= 10) {
        	if(store.charAt(1)<='2' && store.charAt(2)<='3') {
        rev = (rev * 10) + i%10; } }
        return(n == rev) ? 1 : 0; 
    }
    static void total(int min, int max) 
    { int count=0;
        for (int i = min; i <= max; i++) {
            if (check(i)==1)  {
                count++; 
               }  
     }
        System.out.println(count*2);
    } 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        String s0="000000";
        String s=String.valueOf(n1);
        String s1=s.concat(s0);
         int start=Integer.parseInt(s1);
         String s2=String.valueOf(n2);
        String s3="235959";
        String s4=s2.concat(s3);
        int end=Integer.parseInt(s4);
        total(start,end);
    }
}
