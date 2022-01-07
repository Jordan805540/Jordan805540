package program;

public class WAPToRemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
//		{
//			String s="abcdefabcef";
//			String s2= "";
//			for(int i=0; i<s.length();i++)
//			{
//				boolean found = false;
//				for(int j=0; j<s2.length(); j++)
//				{
//					if(s.charAt(i)==s2.charAt(j))
//					{
//						found = true;
//						break;
//					}
//				}
//				if(found == false)
//				{
//					s2=s2+s.charAt(i);
//				}
//			}
//			System.out.println(s2);
//	
//		}
//		
		String s ="111144458555///1133588996";
    	String newstr = ""  ;        
        for (int i = 0; i < s.length(); i++)    
        {   
            char charcter = s.charAt(i);            
            if (newstr.indexOf(charcter) < 0)   
            {   
                newstr = newstr + charcter;   
            }    
        }   
        System.out.println(newstr);  
		
		
	}
	
	
	
}
