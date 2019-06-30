import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Exception2 {
	public static void main(String[] args) {
		File file= new File("text.txt");
		try{
		FileReader fr= new FileReader(file);//reading a file
		System.out.println("continuing.......");
		}
		catch(FileNotFoundException e)
		{
			//e.printStackTrace();
			System.out.println("file not found:" + file.toString());
		}
		System.out.println("finished");
		

	}

}
