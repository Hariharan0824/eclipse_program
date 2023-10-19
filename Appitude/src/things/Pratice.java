package things;

public class Pratice {
	public static void main(String[]args) {
		String word="LEVEL";
		String reverse="";
		char[] ch=word.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println("word:"+ch[i]);
			reverse=reverse+ch[i];
		}
		if(word.equals(reverse)) {
			System.out.println("It is a palindrom");
		}else {
			System.out.println("It is not a palindrom");
		}
		}

}
