import java.util.*;
public class armstrong {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int n=sc.nextInt();
        int temp=n;
        int val=0;
        while(n>0)
        {
            int dig=n%10;
            val=val+(dig*dig*dig);
            n=n/10;
        }
        if(temp==val)
        {
            System.out.println("is an armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}    
}
