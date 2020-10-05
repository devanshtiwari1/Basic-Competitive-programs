package MediumLevel;
import java.util.Scanner;
public class Philaland {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-- > 0)
{
	int n=sc.nextInt();
    int count=0;
    int total=0;
    for(int i=1;i<=n; i++) {
    	if(total<i)
    	{
    		count++;
    		total=total+i;
    		i=total;
    	}
    }
    System.out.println(count);
}
}
}
