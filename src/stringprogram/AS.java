package stringprogram;

public class AS {
	
	public static void main(String[] args) {
		
		
		
		
		String orignal = "i am driving a car";
	    
        String reverse = "";
	    
	           
	    
	    for(int i=0; i<orignal.length();i++)
	      {
	    	char ccc=orignal.charAt(i);
	    	
   	         reverse =ccc+reverse;	
	    	
	    }
	    
	    System.out.println("orignal string is:- "+orignal);
	    System.out.println("reverse string is:- "+reverse);
	}

}
