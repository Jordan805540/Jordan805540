package program;

public class WAPToCountTheNumberOfOccurrenceOfCharactersInAString {

	public static void main(String[]arge) {
		
		String s="abcdefkkkjhfdghij";
		String s2="J87654dfghj97";
		char[] c=s2.toCharArray();
		int i2 = c.length;
		int i =0;
		
		int j=0;
		int counter =0;
		for (i=0 ; i<i2;i++)
		{
			counter=0;
			for (j=0; j<i2;j++)
			{
				if(j<i && c[i]==c[j])
				{
					break;
					
				}
				if(c[j]==c[i])
				{
					counter++;
					
				}
				if(j==i2-1)
				{
					System.out.println("The character " + c[i]+" is present "+counter+" times");
				}
			}
		}
		
	}
}
