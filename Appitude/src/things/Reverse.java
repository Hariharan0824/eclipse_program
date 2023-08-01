package things;

public class Reverse {
	
	public static void main(String[] args) {
		
		String ch="Morning Guys";
		System.out.println(ch.length());
		System.out.println("Number of words:"+ch.split(" ").length);
		char[] ch1=ch.toCharArray();
		for(int i=ch1.length-1;i>=0;i--)
		{
			System.out.println(ch1[i]);
		}
		
	}
	
	
	

}
