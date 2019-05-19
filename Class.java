
public class Class {
	int no;
	char name;
	
	void display()
	{
		System.out.println("enter student name:"+name);
		System.out.println("enter student roll no:"+no);
		
	}

	public static void main(String[] args) {
		Class obj=new Class();
		obj.display();

	}

}
