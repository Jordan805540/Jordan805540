package stringprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ArrysEqualorNot {
	
	
	
	public static void main(String[] args) {
		
		int [] a= {20,30,50 };
		int [] b= {20,30,50 };
		int [] c= {10,40,50 };
		
		
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
	
		
		int aa=0;
		
		
		for(int d:a)
		{
			
			aa=aa+d;
			
			
			System.out.println(aa);
			
		}
		
		System.out.println("************");
		
		
		
		int k=6;
		int g=6;
		int sum=0;
		
		for(int i=1 ; i<=g; i++)
		{
			sum=sum+k;
			
		}
		
		System.out.println(sum);
		
		System.out.println("************");
		
		int num1 = 10;
		int num2 = 20;
		int sum1 = 0;

		for (int i = 1; i <= num2; i++) {
			sum1 = sum1 + num1;
		}

		System.out.println(sum1);
		
		System.out.println("************");
		
		
		
		
		
		
		int ar[] = { 10, 20, 30, 40, 60, 40, 50, 60, 80, 100 };

		TreeSet tr = new TreeSet();

		for (int num : ar) 
		{
			tr.add(num);
		}

		ArrayList al = new ArrayList(tr);

		System.out.println("2nd highest num: " + al.get(al.size() - 2));

		System.out.println("2nd lowest num: " + al.get(1));


		System.out.println("************");
		int h=10;
		int f=20;
		int smallest=( h<f ? h:f);
		System.out.println("smallest number "+smallest);
		
		System.out.println("************");
		
		
		
		
		int [] dd = {1,2,3,4,5};
		
		int largest = dd[0];
		
		for(int i=1; i<dd.length; i++)
			
		{
			if(dd[i]>largest)
				
			{
				largest =dd[i];
				
			}
			
			
		}
		
		System.out.println("larest number "+largest);
		
		
		
		System.out.println("************");
		
		int num = 6;
		int fact = 1; // 5 20 60 120

		// 5432
		for (int i = num; i >= 1; i--)
		
		{

			fact = fact * i;
		}
		System.out.println(fact);
		
		
		String number="ab5ds51s2";
		     String add = number.replaceAll("[a-z]", "");
		     
		     System.out.println(add);
                
		      char[] newadd = add.toCharArray();
		      System.out.println(newadd);
		     int addded =0;
		     
		     
		      for( char abc:newadd)
		      {
		    	  System.out.println(abc); 
		    	  
		    	  
		    	  
		      }
		      
		
		      System.out.println(addded);
		 

		
		
		
		
		
	}

}
