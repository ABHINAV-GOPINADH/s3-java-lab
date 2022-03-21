import java.util.*;
class natural
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        System.out.print("Enter the number till to add :");
        Scanner abhi = new Scanner(System.in);
        n=abhi.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        } 
        System.out.println("sum is "+sum);
    }
}
