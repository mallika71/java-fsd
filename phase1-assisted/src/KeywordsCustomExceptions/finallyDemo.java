package KeywordsCustomExceptions;

public class finallyDemo {
	public static void main(String[] args)
    {
        int a=45,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\nThe result is : " + rs);
        }
    }



}
