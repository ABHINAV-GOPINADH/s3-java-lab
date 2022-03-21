import java.util.*;
class prime 
{
    public static void main(String args[])
    {
        int n,i,a=0;
        System.out.println("enter the number : ");
        Scanner def =new Scanner(System.in);
        n=def.nextInt();
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                a++;
                break;
            }
        }
        if(a==0)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }
}