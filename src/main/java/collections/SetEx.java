package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx {
	//Does not allow duplicates
	//Does not follow insertion order
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("UK");
		hs.add("USA");
		hs.add("india");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.remove("neha"));
		
		Iterator<String> it = hs.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
	//	System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println("Iterator : "+it.next());
		}
	}

}
