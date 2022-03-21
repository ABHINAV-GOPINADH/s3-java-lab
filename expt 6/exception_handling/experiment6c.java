import java.io.*;
class experiment6c
{
    public static void main(String args[])throws Exception
    {
        try
        {
            FileInputStream fin = new FileInputStream("expt c.txt");
            int i;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);
            }
            fin.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}