package DatabaseTesting;

public class GFG {
	
public static void main (String[] args) {
        
       String str= "121", nstr="";
       String ps="";
       
       for(int i = str.length()-1;i>=0;i--) {
    	   nstr = nstr+str.charAt(i);
       }
       
       if(str.equals(nstr)) {
    	   ps="yes";
    	   System.out.println(ps);
       }
       
        
        
}
}


