import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input=new Scanner(System.in);
         System.out.println("enter a line of text:");
         String line=input.nextLine();
         System.out.println("you entered:"+line);
         System.out.println("enter a value:");
         int value=input.nextInt();
         System.out.println("you entered:"+value);
	}

}
