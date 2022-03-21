import java.util.*;
class frequency
{
    public static void main(String args[])
    {
        int j,i,total;
        int[] freq =new int[100];
        String str1;
        char n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String : ");
        str1=obj.nextLine();
        total=str1.length();
        for(i=0;i<total;i++)
        {
            n=str1.charAt(i);
            System.out.println("word is : "+n);
            for(j=0;j<total;j++)
            {
                if(n==str1.charAt(j))
                {
                    freq[i]++;
                }
            }
            System.out.println(freq[i]);
        } 
    }
}