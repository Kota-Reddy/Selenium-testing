package DatabaseTesting;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="neha";
		String revName ="";
		
		for(int i=name.length()-1;i>=0;i--) {
			revName=revName+name.charAt(i);
			
		}

		System.out.println(revName);
	}

}
