package KeywordsCustomExceptions;

public class throwsDemo {
	void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
        rs = a / b;
        System.out.print("\nThe result is : " + rs);
    }
     public static void main(String[] args)
    {
    throwsDemo t = new throwsDemo();
         try
        {
            t.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
    }


}
