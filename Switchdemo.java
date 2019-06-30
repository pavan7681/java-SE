//switch statement: it exexcutes one statement from multiple statements                          
import java.util.Scanner;
public class Switchdemo {

	public static void main(String[] args) {
	int number =20;
	switch (number){
	case 10: System.out.println("10");
	  break;
	case 20: System.out.println("20");
	  break;
	case 30: System.out.println("30");
	  break;
	 default:System.out.println("not in 10,20,30");
	}
	Scanner input=new Scanner(System.in);//displaying month name using switch
	System.out.println("enter the month number:");
	int month=input.nextInt();
	String monthname ="";
	switch(month) {
	case 1: monthname="january";
	break;
	case 2: monthname="february";
	break;
	case 3: monthname="march";
	break;
	case 4: monthname="april";
	break;
	case 5: monthname="may";
	break;
	case 6: monthname="june";
	break;
	case 7: monthname="july";
	break;
	case 8: monthname="august";
	break;
	case 9: monthname="september";
	break;
	case 10: monthname="october";
	break;
	case 11: monthname="november";
	break;
	case 12: monthname="december";
	break;

	}
	
	System.out.println(monthname);

	}

}
