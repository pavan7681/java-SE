
public class Static {
	String name;
	static String description;
	
	public  void showName()
	{
	System.out.println(name);
	}
	public static void showInfo()
	{
		System.out.println(description);
	}
	 public static int count=0;
	 public Static()
	{
		count++;
	}
	
	public static void main(String[] args) {
          Static.description= "i am pavan";
          Static.showInfo();
          System.out.println("before creating the objects,count is: "+Static.count);
          Static obj1= new Static();
          Static obj2= new Static();
          System.out.println("after creating the objects,count is: "+Static.count);
          obj1.name="jimmy";
          obj2.name="teddy";
          obj1.showName();
          obj2.showName();
          

	}

}
