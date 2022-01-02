package practiseSeleniumTopics;

public class DuplicateElementInArray {

	public static void main(String[] args) {
	
		String[] str= {"Raushan","Amit","Rinku","Raushan","Amit"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("Found Duplicate "+str[i]);
				}
			}
		}

	}

}
