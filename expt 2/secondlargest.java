import java.util.*;
class secondlargest
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n,i,temp,j;
        System.out.println("Enter the number of elements : ");
        n=obj.nextInt();
        int a[]=new int[100];
        System.out.println("Enter the elements : ");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second largest number is "+a[n-2]);
    }
}