import java.util.*;
class freqrev
{
    public static void main(String args[])
    {
        freqrev abhi = new freqrev();
        abhi.reverse();
        abhi.frequency();
    }
    void reverse()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=obj.nextLine();
        int i,n,m;
        n=str.length()-1;        
        m=n;
        String rev="";
        for(i=n;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    void frequency()
    {
        Scanner abhin = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=abhin.nextLine();
        int n=str.length();
        System.out.print("Emter the character to check the frequnecy :");
        char a;
        a=abhin.next().charAt(0);
        int freq=0,i;
        for(i=0;i<n;i++)
        {
            if(a==str.charAt(i))
            {
                freq++;
            }
        }
        System.out.print("frequency is "+freq);
    }
}