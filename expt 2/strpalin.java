import java.util.*;
class strpalin
{
    public static void main(String args[])
    {
        Scanner str = new Scanner(System.in);
        int n,i;
        String str1,str2="";
        System.out.println("Enter the string : ");
        str1=str.nextLine();
        n=str1.length();
        for(i=n-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        System.out.println(str2);
        if(str1==str2)
        {
            System.out.println("String is palindorme ");
        }
        else
        {
            System.out.println("String is not palindrome ");
        }
    }
}