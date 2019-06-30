class Person{
	String name;
	int age;
	void speak()
	{
		System.out.println("my name is: "+name);
		
	}
	
   // void ageOfRetirement()
	{
		int yearsleft=65-age;
		System.out.println(yearsleft);
		 
	}
	int ageOfRetirement()
	{
		int yearsleft=65-age;
		return yearsleft;
	}
	int getAge()
	{
		return age;
		
	}
	String getName()
	{
		return name;
		
	}
}
public class App{

	public static void main(String[] args) {
	   Person person1 =new Person();
	   person1.name ="pavan";
	   person1.age= 19;
	   
	   person1.speak();
	   int years = person1.ageOfRetirement();
	   System.out.println("years till retirement :" +years);
	   int age=person1.getAge();
	   String name=person1.getName();
	   System.out.println("name is :" +name);
	   System.out.println("age is :" +age);
	   
	}

}
