package DatabaseTesting;

public class GFG {
	
public static void main (String[] args) {
        
       String str= "huh", nstr="";
       String ps="";
       
       for(int i = str.length()-1;i>=0;i--) {
    	   nstr = nstr+str.charAt(i);
       }
       if(str == "") {
    	   ps="Not valid input";
    	   System.out.println(ps);
       }
       else if(str.equals(nstr)) {
    	   ps="yes";
    	   System.out.println(ps);
       }
       
       else if(str != nstr) {
    	   ps="No";
    	   System.out.println(ps);
       }
       
       
        
        
}

private static boolean isStringNull(String str) {
	// TODO Auto-generated method stub
	if(str == "")
		return true;
	else
		return false;
}
}


