 class A {
	void first()
	{
		System.out.println("this is class A");
	}
	}
class B extends A
{
	void second()
{
	System.out.println("this is class B");
}
}
class C extends B
{
	void third()
	{
		
	}
}
class Multilevel
{
	
	public static void main(String[] args) {
		C obj=new C();
		
		obj.second();

	}

}
