import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        int sum=0,c,n;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number :");
        int a =obj.nextInt();
        n=a;
        while(a>0)
        {
            c=a%10;
            sum=sum+(c*c*c);
            a=a/10;
        } 
        if(n==sum)
        {
            System.out.print("number is Armstrong ");
        }
        else
        {
            System.out.print("number is not armstrong");
        }
        
    }
}