package practiseSeleniumTopics;

public class DuplicateCharacterOccurence {

	public static void main(String[] args) {

		String str = "I am Raushan Kumar";
		System.out.println(str.length());
		int count = 1;
		char[] ch = str.toCharArray();
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[j] != ' ') {
					count++;
					ch[j] = ' ';
				}
			}
			if (count > 1) {
				System.out.println(ch[i] + " occured " + count + " times in " + str);
				count = 1;
			}

		}

	}

}
