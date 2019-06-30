
public class Exception {

	public static void main(String[] args) {
		try
		{
			System.out.println("open files");
			int n=args.length;
			System.out.println("n="+n);
			int a=45/n;
			System.out.println("a="+a);
		}
catch(ArithmeticException ae)
		{
	System.out.println(ae);
	System.out.println("please pass data while running this program");
		
		}
finally
{
	System.out.println("close files");
}
}
}