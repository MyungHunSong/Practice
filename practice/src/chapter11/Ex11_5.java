package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;

public class Ex11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj); 
		}
		
		 
		int[] list1 = {0,1,2,3,4,5};
			
		int[] list3 = Arrays.copyOf(list1, 4);
		System.out.println(Arrays.toString(list3));
	
	}
}
