package program;

public class WAPToReverseTheCompleteSentence {
	
	public static void main(String[] args) {
		
		
		String s = "This is String";
		
		
		String[] Splitvalue = s.split("\\s");
		
		int size = Splitvalue.length-1;
		
		for(int i =size; i>=0; i--)
		{
			System.out.print(Splitvalue[i]+" ");
		}
		
	
	}
}
