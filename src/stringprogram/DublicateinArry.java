package stringprogram;

import java.util.HashMap;
import java.util.Set;

public class DublicateinArry {

	
	
	public static void main(String[] args) {
		
		
		
		String[] arr = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Java" ,"JDBC"};
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String str : arr) {
			
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		Set<String> set = map.keySet();
		
		for (String str : set) {
			if (map.get(str) > 1) {
				System.out.println(str + ": " + map.get(str));
			}
		}
	}
}


		
//		String [] ab = {"abc","def","xyz","apple","abc","apple","xyz"};
//		
//		HashMap<String, Integer> map =new HashMap<String,Integer>();
//		
//		for(String a:ab)
//		{
//			if(map.containsKey(a))
//			{
//				map.put(a, map.get(a)+1);
//				
//			}
//			else
//			{
//				map.put(a, 1);
//			}
//			
//			    Set<String> set = map.keySet();
//			    
//			    for(String sets:set)
//			    {
//			    	if(map.get(sets)>1)
//			    	{
//			    		System.out.println(sets+": "+map.get(sets));
//			    	}
//			    	
//			    }
//			    
//			
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

