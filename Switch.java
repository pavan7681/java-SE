import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the command:");
		String text=input.nextLine();
		switch(text)
		{
			case "start":
			System.out.println("machine is started");
			break;
			
			case "stop":
			System.out.println("machine is stoped");
			break;
			
			default:
			System.out.println("command not given");
		}

	}

}
