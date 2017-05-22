package youtube;

public class Calc implements Add, Subtract {

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

}
