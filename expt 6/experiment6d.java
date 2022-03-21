class experiment6d
{
    public static void main(String ars[])
    {
        try
        {
            int b=0;
            if(b<500)
            {throw new balanceException("Low Balance");}
        }
        catch(balanceException e)
        {
            System.out.println(e);
        }
    }
}
class balanceException extends Exception
{
    public balanceException(String s)
    {
        super(s);
    }
}