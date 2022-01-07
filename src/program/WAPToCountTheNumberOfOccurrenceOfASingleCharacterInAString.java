package program;

public class WAPToCountTheNumberOfOccurrenceOfASingleCharacterInAString {

	public static void main(String[]agre) {
		String s = "asbhiaksjeja";
		int count = 0;
		
		for (int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a')
			{
				count=count+1;
			}
		}
		System.out.println("the character 'a' is available for "+count+" times");		
	}
}
