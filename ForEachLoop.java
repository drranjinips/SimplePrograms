package xxxx;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		   list.add("vimal");  
		   list.add("sonoo");  
		   list.add("ratan");  
		   //traversing the list of elements using for-each loop  
		   for(String s:list) {
			 System.out.println("First Element of Array is  "+ s);  
		   }
	}
}
