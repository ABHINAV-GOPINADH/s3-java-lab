import java.util.*;
class concatenate
{
    public static void main(String args[])
    {
        join obj =new join();
        obj.join("Abhinav","K G");
        obj.join(5,6); 
    }
}
class join
{
    void join(String str1,String str2)
    {
        String str3=str1+str2;
        System.out.println("concatenated string is "+str3);
    }
    void join(int a,int b)
    {
        System.out.print("concatenated integers is "+a+b);
    }
}
