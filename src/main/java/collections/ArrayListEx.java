package collections;

import java.util.ArrayList;

public class ArrayListEx {
	
	//Accepts duplicate
	//Follow insertion order
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>(10);
		al.add("java");
		al.add(1, "tutorial");
		al.contains("java");
		System.out.println(al.indexOf("Neha"));
		System.out.println(al.indexOf("pal"));
		System.out.println(al.isEmpty());
		

	}

}
