
class Singleinheritance1 {
int a=5;
int b=3;
 int c;
 
 void add()
 {
	 c=a+b;
	 System.out.println("sum of two values is:"+c);
 }
 }
class Inherited extends Singleinheritance1
{
	void sub()
	{
		c=a-b;
	System.out.println("subtraction of two values is:"+c);
	}
}

class F

{
	public static void main(String[] args) {

		 Inherited obj=new  Inherited();
        obj.add();
        obj.sub();

	}

}

