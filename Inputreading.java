import java.util.Scanner;
public class Inputreading {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the text :");
		String text=input.nextLine();
		System.out.println("the text is: "+text);
         
		System.out.println("enter the floating value:");
		double value=input.nextDouble();
		System.out.println("the value is:"+value);
	}

}
