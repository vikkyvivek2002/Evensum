import java.util.Scanner;
public class Evensum
{
	public static void main(String[] args) 
	{
	    int x,i,sum = 0; 
		System.out.println("enter the Number");
	Scanner s = new Scanner( System.in);
	x = s.nextInt();
	for(i=1;i<=x;i++)
	{
	    if((i%2)==0)
	    sum = sum+i;
	    
	}
	System.out.println("the sum of all even numbers is = " +sum);
	
}
}

