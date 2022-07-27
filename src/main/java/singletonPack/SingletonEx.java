package singletonPack;

public class SingletonEx {
	
	private static SingletonEx single_instance = null;
	
	public String str;
	
	private SingletonEx() {
		str = "Hello !! I am string of singleton class";
		
	}
	
	public static SingletonEx getInstance() {
		
		if(single_instance == null) {
			single_instance = new SingletonEx();
		}
		return single_instance;
		
	}
	

}
