package singletonPack;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonEx se1 = SingletonEx.getInstance();
		SingletonEx se2 = SingletonEx.getInstance();
		SingletonEx se3 = SingletonEx.getInstance();
		
		System.out.println("Se1 is : "+se1.hashCode());
		System.out.println("Se2 is : "+se2.hashCode());
		System.out.println("Se3 is : "+se3.hashCode());
		
		
		if(se1 == se2 && se2 == se3) {
			System.out.println("All three objects point to the same memory location!!");
		}
		else {
			System.out.println("All points different memory location!!");
		}

	}

}
