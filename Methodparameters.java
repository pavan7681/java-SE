
public class Methodparameters {
       public void cricketer(String text)
       {
    		System.out.println(text);
    		
       }
       public void batting(int score)
       {
    		System.out.println("batting:"+score);
       }
       public void scorecard(String name,int run,double strike)
       {
    		System.out.println("batsman :"+ name +  "score:" + run +"strikerate:" +strike);
       }
       
	public static void main(String[] args) {
		Methodparameters obj=new Methodparameters();
		obj.cricketer("yuvaraj singh");
		obj.batting(81);
		obj.scorecard("yuvraj singh",81,176.5);
	}
}
