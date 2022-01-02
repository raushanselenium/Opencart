package practiseSeleniumTopics;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpaceCollection {

	public static void main(String[] args) {
		
		String str=new String("This is my first program");
		int beginIndex=0;
		List<String> ls=new ArrayList<String>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				String s1=str.substring(beginIndex,i);
				ls.add(s1);
				System.out.println(ls);
				beginIndex=i+1;
			}
		}
		ls.add(str.substring(beginIndex));
		for(String s:ls)
			System.out.println(s);
		//System.out.println(ls);

	}

}
