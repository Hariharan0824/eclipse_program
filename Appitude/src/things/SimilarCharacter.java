package things;

public class SimilarCharacter {
	public static void main(String[] args) {
		String words="As soon As i improve my skills and i improve my programming levels ";
		char[] ch=words.toCharArray()	;
		
		for(int i=0;i<=ch.length;i++) {
			for(int j=i+1;j<=ch.length;j++) {
			
				if(ch[i]==ch[j]) {
					System.out.println("Similar words:"+ch[j]);
				}
			}
		}

	}
	

}


