/*write a java program to take integers from user unitl he enters 0*/
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter a integer: ");
			int value=input.nextInt();
			if(value==0) {
				break;
			}
	}
	
}
}
