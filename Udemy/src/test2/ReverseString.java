package test2;

public class ReverseString {

	public static void main(String[] args) {
		String one = "This is a new string";
		
		String a =""; //empty string
		
		String[] rev = one.split("\\s+"); //need to learn regex. eg: \\s+ , nothing , a ,
		
		for(String test : rev){
			a = test +" " + a;
			//a = a + test;
		}
		System.out.println(a);

	}

}
