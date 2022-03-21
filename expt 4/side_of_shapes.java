import java.util.*;
abstract class shape
{
    abstract void numberOfSides();
}
class rectangle extends shape4
{
    void numberOfSides()
    {
        System.out.print("rectangle has 4 sides..\n");
    }
}
class triangle extends shape4
{
    void numberOfSides()
    {
        System.out.print("triangle has 3 sides...\n");
    }
}
class hexagon
{
    void numberOfSides()
    {
        System.out.print("hexagon has 6 sides...\n");
    }
}
public class side_of_shapes
{
    public static void main(String args[])
    {
        rectangle r = new rectangle();
        r.numberOfSides();
        triangle t = new triangle();
        t.numberOfSides();
        hexagon h = new hexagon();
        h.numberOfSides();
    }
}