import java.util.*;
class shape
{
    public static void main(String args[])
    {
        perimeter obj = new perimeter();
        obj.perimeter(4,5);
        obj.perimeter(5);
    }
}
class perimeter
{
    void perimeter(int a)
    {
        System.out.println("perimeter of circle is "+(2*3.14*a));
    }
    void perimeter(int a,int b)
    {
        System.out.println("perimenter of rectangle is "+(2*(a+b)));
    }
}