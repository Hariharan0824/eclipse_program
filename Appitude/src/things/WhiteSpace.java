package things;

public class WhiteSpace {
	public static void main(String[] args) {
		String words="Today Office Leave";
		String remove="";
		char[] ch=words.toCharArray();
		int index=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				remove=remove+ch[i];
			}
			else {
				index++;
			}
			
		}
		System.out.println(remove);
		System.out.println("Number of white space:"+index);
		
	}

}
