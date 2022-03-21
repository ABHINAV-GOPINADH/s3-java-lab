import java.util.*;
class expt32
{
    public static void main (String args[]) 
    {
        expt32 obj= new expt32();
        obj.factorial();    
        obj.digits();
    }
    void factorial()
    {
        int a,i,fact=1;
        System.out.print("Enter the number to find factorial: "); 
        Scanner obj2 = new Scanner(System.in);
        a = obj2.nextInt();
        for(i=1;i<=a;i++)
        {
            fact=i*fact;
        }
        System.out.println("factorial is "+fact);
    }
    void digits()
    {
        int a,n=0,d;
        System.out.print("Enter the number to find sum of digits : "); 
        Scanner obj1= new Scanner(System.in);
        a = obj1.nextInt();
        while(a>0)
        {
            d=a%10;
            n=n+d;
            a=a/10;
        }
        System.out.print("sum of digits is "+n);
    }
}