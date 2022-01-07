package stringprogram;

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {
	
	
	public static void main(String[] args) {

		String a = "abcxyzabcabc1xyz";
		
		       char[] b = a.toCharArray();
		       
		       
		       HashMap<Character, Integer> smap = new HashMap<Character, Integer>();
		       
		       
		      for(char c: b)
		      {
		    	  if(smap.containsKey(c))
		    	  {
		    		smap.put(c, smap.get(c)+1);
		    		  }
		    	  else
		    	  {
		    		  smap.put(c, 1);
		    	  }  
		      }
		       
		       
		Set<Character>keys=smap.keySet();
		
				
		
		for(char key:keys)
		{
			if(smap.get(key)>1)
			{
				System.out.println(key+":"+smap.get(key));
			}
		
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		String str = "abcxyzabcabc1xyz";///find duplicate char in string
//		char[] ar = str.toCharArray();
//
//		HashMap<Character, Integer> smap = new HashMap<Character, Integer>();
//
//		for (char str1 : ar) {
//			if (smap.containsKey(str1)) 
//			{
//				smap.put(str1, smap.get(str1) + 1);
//			}
//			
//			else {
//				smap.put(str1, 1);
//			}
//		}
//
//		Set<Character> keys = smap.keySet();
//
//		for (char key : keys) {
//			if (smap.get(key) > 1) 
//			{
//				System.out.println(key + " :" + smap.get(key));
//			}
//
//		}

	}
}


	


