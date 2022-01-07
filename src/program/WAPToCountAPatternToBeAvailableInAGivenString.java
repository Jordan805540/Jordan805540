package program;

public class WAPToCountAPatternToBeAvailableInAGivenString {
	
	public static void main(String[] args) {
		String s="abc";
		String s2="abcsdfgabchjklabczxcvbnmabcerty";
		
		int m = s.length();
		int n = s2.length();
		int res = 0;
		
		for (int i=0; i<=n-m;i++)
		{
			int j;
			for(j=0; j<m;j++)
			{
				if(s2.charAt(i+j)!=s.charAt(j))
				{
				break;
				}
			}
		
			if(j==m)
		{
			res++;
			j=0;
		}
		
	}
		System.out.println("the count is :"+res);
	}

	
}
