/*packages means it is the collection of interfaces,classes and sub packages
it is used to categorize the classes and interfaces ,so that they are easily maintained
there are two types of packages 1.built in 2.userdefined packages*/
package mypack;
 
public class Cricket
{
	void playing()
	{
		System.out.println("i am playing ");
	}
}
class Singer
{
	void singing(){
		System.out.println("i am singing");
	}
}

public class Simple {

	public static void main(String[] args) {
	Cricket c =new Cricket();
	c.playing();
	Singer s =new Singer();
	s.singing();
     
	}
}

