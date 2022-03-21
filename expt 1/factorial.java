import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        int fact=1,n,i;
        System.out.print("Enter the number :");
        Scanner abc=new Scanner(System.in);
        n=abc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        } 
        System.out.println(fact); 
    } 
}