package arrayList;

import java.util.ArrayList;

public class AddPrintElement {

	public static void main(String[] args) {
		
		//Add element to Arraylist
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Raushan");
		al.add("Swati");
		al.add("Kumar");
		al.add("Singh");
		al.add(0, 100);
		System.out.println(al.size());
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		

	}

}
