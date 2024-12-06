/*E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A */
public class pattern12 {
    public static void main(String args[])
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }      
}
