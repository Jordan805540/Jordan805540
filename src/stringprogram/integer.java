package stringprogram;

public class integer {

	
	
	public static void main(String[] args) {
		
	
	

		String ss35 = "khjahdjsa23432jsdkj24";
	     
	   String new1 = ss35.replaceAll("[0-9]", "");
	    
	        System.out.println(new1);
	        
	        System.out.println("********");
	    
	    String orignal = "i am driving a car";
	    
	    String reverse = "";
	    
	    char c;
	    
	    for(int i=0; i<orignal.length();i++)
	    {
	    	c=orignal.charAt(i);
	    	
	    	reverse =c+reverse;
	    	
	    	
	    	
	    }
	    
	    System.out.println("orignal string is:- "+orignal);
	    System.out.println("reverse string is:- "+reverse);
	   
	    System.out.println("********");   
	    
	    String test ="i am a disco dancer";
	    
	    String test2="";
	    
	     
	            String[] value = test.split("\\ss");
	            
	            int size =value.length-1;
	            
	            for(int i=size; i>=0;i--)
	            {
	               System.out.println(value[i]+" ");
	               
	               
	            }
	            System.out.println("********"); 
	            
	            
	               
	            String s[] = "i am a disco dancer".split(" "); 
	            String ans = ""; 
	            for (int i = s.length - 1; i >= 0; i--)
	            
	            { 
	              ans += s[i] + " "; 
	            } 
	            System.out.println("Reversed String: " + ans); 
	          }
	            
	
	            
	            
	    
	            
//	    
//	    String abc="ab5ds51s2";
//	    
//	    int digit1=0;
//	    
//	  //  String bca="";
//	    
//	    for(int ii=0;ii<abc.length(); ii++)
//	    {
//	    	
//	    	if(Character.isDigit(abc.charAt(ii)))
//	    	{
//	    		
//	    		bca=abc.substring(ii, ii+1);
//	    		 
//	    		digit1	= digit1 + Integer.parseInt(bca);	
//	    		
//	    	}
//	    }
	    	
	    	
	    	
	    	
	
//	    
//	    System.out.println(digit1);
//	    
//	    
//	    
//	    
//	    System.out.println("**********");
//	    String alph = "d5de5dd56d5dd";
//	    
//	        String newalph =alph.replaceAll("[a-z]", "");
//	     
//	    System.out.println("number is "+newalph);
//	    
	    
	    	
	    	
	    	
	    	
	    	
	    
	    
	    
	    
	    
}



	    
	  
	       
	
	
	
	
	
	
	
	
	
	     
	
	
	
		
		
		
		
		
	

