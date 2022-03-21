import java.util.*;
class oddoreven
{
    public static void main(String args[])
    {
    int a,n;
    System.out.println("enter the number");
    Scanner abc= new Scanner(System.in);
    n=abc.nextInt();
    a=n%2;
    if(a==0)
    {
        System.out.println("number is even");
    }
    else 
    {
        System.out.println("number is odd");
    }
}
}