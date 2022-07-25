package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {
	//Follow key-vaue pair machanism

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable< Integer, String> hm = new Hashtable<Integer,String>();
		hm.put(0, "Java");
		hm.put(1, "c");
		hm.put(2, "c++");
		hm.put(3, "Python");
		System.out.println(hm);
		
		hm.put(0, "Java Selenium");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		System.out.println(hm.get(7));
		System.out.println(hm.get(3));
		System.out.println(hm.remove(0));
		System.out.println(hm);
		System.out.println(hm.remove(8));
		
		Set es = hm.entrySet();
		Iterator it = es.iterator();
		
		while(it.hasNext()) {
//			System.out.println(it.next());
			
			Map.Entry kv =(Entry) it.next();
			System.out.println(kv.getKey());
			System.out.println(kv.getValue());
			System.out.println(kv.getClass());
			
		}

	}

}
