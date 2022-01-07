package stringprogram;

public class StringSinglecharacte {
	
	public static void main(String[] args) {
		
		String a="bacdefabcdef";
		
		int count=0;
		
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a')
			{
				
				count=count+1;
				
			}
		}
		
		System.out.println("The character a is available for "+count);
		
		
		
		//remove duplicate characters from String:
		
		
		String s1="abcdefabcdef";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			Boolean found= false;
			
			for(int j=0; j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					found=true;
					
					break;
				}
				
			}
			if(found==false)
			{ s2=s2+s1.charAt(i);
			
				
			}
		}
		
		System.out.println(s2);
					
		//reverse the complete sentence for example String 
		
		
		
		String b1="this is String";
		String rev="";
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}
			
			
			
			
			
			
			
			

		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
	}
	
	


