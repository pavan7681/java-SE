// control statements 
//          if statement
//          if else statement
//          using ternary operator 
//          if else if
//          nested if
           
public class Ifstatement {

	public static void main(String[] args) {
	int number=13;
	 if(number%2==0)//if else case//
	 {
		 System.out.println("number is even");
	 }
	 else
	 {
		 System.out.println("odd number");
	 }
	 
	  String output=(number%2==0)?"even number":"odd number";//using ternary operator//
	  System.out.println(output);
	  
	  int marks= 65;    //if else if//
	  if(marks<100 && marks>90)
	  {
		  System.out.println("A grade");
	  }
	  if(marks<90 && marks>80)
	  {
		  System.out.println("B grade");
	  }
	  if(marks<80 && marks>70)
	  {
		  System.out.println("C grade");
	  }
	  if(marks<70 && marks>60)
	  {
		  System.out.println("D grade");
	  }
	  else
	  {
		  System.out.println("invalid");
	  }
	  
      int age=40;      // nested if//
      int weight=50;
      
      if(age>30)
      {
    	  if(weight>40)
    	  {
    		  System.out.println("aligibale to donate blood");
    	  }
      }

	}

}
