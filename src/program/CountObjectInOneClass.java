package program;

import java.util.Arrays;

public class CountObjectInOneClass 
{
	static int count;
	
    public CountObjectInOneClass()
    {
    
        count++;
    }
          
    public static void main(String[] args) 
    {
    	CountObjectInOneClass obj1 = new CountObjectInOneClass();
    	CountObjectInOneClass obj2 = new CountObjectInOneClass();
    	CountObjectInOneClass obj3 = new CountObjectInOneClass();
    	CountObjectInOneClass obj4 = new CountObjectInOneClass();
    	
        System.out.println("Number of objects created:"+count);
    }
}