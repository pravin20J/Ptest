public class StringCheckData {
	
	public static void main(String[] args) {
		
		String s1="Java";
		String s2= new String("Java");
		
		//String s2= "Java";
		
		
		
		if(s1.equals(s2))
			System.out.println("Equals Returned True");
		else
			System.out.println("Equals Returned False");
		
		
		if(s1==s2)
			System.out.println(" == Returned True");
		else
			System.out.println(" == Returned False");
		
		
	}

}
