package things;

public class SimilarWords {
	public static void main(String[] args) {
		String words="As soon As i improve my skills and i improve my programming levels ";
		String[] ch=words.split(" ");	
		int Count=0;
		for(int i=0;i<=ch.length;i++) {
			for(int j=i+1;j<=ch.length;j++) {
			Count++;
				if(ch[i]==ch[j]) {
					System.out.println("Similar words:"+ch[j]);
				}
			}
		}

	}
	

}
