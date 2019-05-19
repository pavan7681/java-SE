
public class Arraystrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] words=new String[3];
       words[0]="pavan";
       words[1]="hemanth";
       words[2]="jimmmy";
       for(int i=0;i<words.length;i++)
       {
    	   System.out.println(words[i]);
       }
       String[] bat= {"nike","adidas","rebook"};
       for(String cricket:bat)
       {
    		System.out.println(cricket);
       }
	}

}
