
public class This {
	String name;
	int id;
	int score;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
	return name;
	}
	public void setId(int id)
	{
		this.id=id;
		
	}
    public int getId()
    {
      return id;
      }
      
	public static void main(String[] args) {
		This obj=new This();
		obj.setName("pavan");
		obj.setId(81);
			System.out.println("hi my name is:"+obj.getName());

	}

}
