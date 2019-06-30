
   class Frog {
	   private int id;
	   private String name;
/*	public String toString()
	{
		return "hello";
	}*/
	public Frog(int id ,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id +":"+ name;
	}
   }
	
	public class Ap
	{

	public static void main(String[] args) {
		Frog frog1=new Frog(81,"bushhuu");
		System.out.println(frog1);

	}

}

