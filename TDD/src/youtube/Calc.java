package youtube;

public class Calc implements Add, Subtract {
	
	private String num = "1";
	private int number;
	private Calc two;
	
	public long subtract(long... ls) {
		long ret = ls[0];
		
		for(int a = 1; a<ls.length;a++){
			ret -= ls[a];
		}
		return ret;

	}

	public long add(long... ls) {
		long ret = 0;
		
		for (long a : ls){
			ret += a; 
		}
		return ret;
		// TODO Auto-generated method stub

	}
	
	public int retu(){
		return 0;
	}
	
	public String retuString(){
		return num;
	}
	
	public void setString(String a){
		num = a;
	}

	public void methNoReturn(){
		System.out.println("Hi");
	}
	
	public int getInt(){
		return number;
	}
	public void objSet(){
		if(number ==1){
		two = new Calc();
		}
	}
}
