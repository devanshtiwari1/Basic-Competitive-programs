package MediumLevel;
import java.util.*;
class S {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
         int start=n1*1000000;
         String s2=String.valueOf(n2);
        String s3="235959";
        String s4=s2.concat(s3);
        int count=0;
        int end=Integer.parseInt(s4);
         int sum=0,r;
         int temp=start;
         System.out.println(start);
         System.out.println(end);
        if(n1<n2)
        { 
            for(int i=temp;i<=end;i++)
            {  
                while(start>0)
                 {
                 r =start%10;
                 sum=(sum*10)+r;
                 start=start/10;
                }
                if(temp == sum) {
                    count++;
                System.out.println(count);
                }
            }
            sum=0;
        
        }
    }
}
