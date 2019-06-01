//method overloading is one of the way of implementing polymorphoism//
public class Methodoverload {
	int a;
	int b;
	int c;
	int d;
	Methodoverload(int b,int c)
	{
		a=b+c;
		System.out.println("sum is:"+a);
				
	}
	void sum(int a,int b) {
		d=a+b;
		System.out.println("sum of the numbers:"+d);
		
		
	}
	Methodoverload(int a,int b,int c)//constructor overload//
	{
		d=a+b+c;
		System.out.println("sum is :"+d);
		
	}
	
	void sum(int a ,int b ,int c)//method overload//
	{
		d=a+b+c;
		System.out.println("sum of the numbers :"+d);
	}

	public static void main(String[] args) {
		Methodoverload obj1=new Methodoverload(4,5);
		Methodoverload obj2=new Methodoverload(4,5,6);
		obj1.sum(10, 20);
        obj1.sum(6, 7,8);
}
}
