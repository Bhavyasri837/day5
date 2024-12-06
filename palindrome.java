import java.util.*;
public class palindrome {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("it is a palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }
    }
    }
    
}
