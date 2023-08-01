package things;

public class UpcLoc {
	public static void main(String[] args) {
		String name="toDay Is FriDay";
		char[] ch=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]= (char) (ch[i]+32);
	}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}

}
}