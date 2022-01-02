package practiseSeleniumTopics;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String str="This is my program";
		String str1="";
		//char[] ch=str.toCharArray();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==' ')
			{
				continue;
			}
			else {
				str1+=str.charAt(i);
			}
		}
			System.out.println(str1);
	}

}
