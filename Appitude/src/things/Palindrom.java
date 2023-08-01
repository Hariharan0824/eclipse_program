package things;

public class Palindrom {
	public static void main(String[] args) {
		String word = "GADAG";
		String reverse="";
		char[] ch= word.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
			reverse=reverse+ch[i];
		}
		
		if(word.equals(reverse)) {
			System.out.println("This is Palindrom");
		}
		else {
			System.out.println("this is Not Palindrom");
		}
	}
	

}
