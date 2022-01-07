package program;

import java.util.Arrays;

public class MergeTwoArrays1 {
	
	
    public static void main(String[] args)
    {
        // first array
        int[] a = { 10, 20, 30, 40 };
  
        // second array
        int[] b = { 50, 60, 70, 80, 90 };
  
        // determines length of firstArray
        int a1 = a.length;
        
        // determines length of secondArray
        int b1 = b.length;
        
        // resultant array size
        int c1 = a1 + b1;
  
        // create the resultant array
        int[] c = new int[c1];
        
             
        for(int i=0;i<a1;i++)
        {
        	c[i]=a[i];
        }
        for(int i=0;i<b1;i++)
        {
        	c[a1+i]=b[i];
        }
        for(int i=0;i<c1;i++)
        {
        	System.out.print(c[i]+" ");
        }
  
       
        
        int [] z = {10,20,30,40};
        int []x = {50,60,70,80,90,100};
        
        int z1=z.length;
        int x1=x.length;
        int y1=z1+x1;
        int [] y = new int [y1];
        
        for(int i=0 ; i<=z1;i++)
        {
        	y[i]=z[i];
   	
        }
       for(int i=0 ; i<=x1 ; i++)
       {
    	   y[z1+i]=x[i];
       }
      
      for(int i=0;i<=y1;i++)
      {
    	  System.out.println(c[i]+" ");
      }
       
       
       
       
       
       
       
        
        
        
        
        
        
        
        
        
        
        // using the pre-defined function arraycopy
//        System.arraycopy(a, 0, c, 0, a1);
//        System.arraycopy(b, 0, c, a1, b1);
//  
//        // prints the resultant array
//        System.out.println(Arrays.toString(c));
    }
}