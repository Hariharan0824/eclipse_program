package things;

public class ParticularWord {
	public static void main(String[] args) {

		String words = "Good morning guys, how are you ?";
       //Print the particular word
		String[] ch = words.split(" ");
         for (int i = 0; i < ch.length; i++) {
			if (ch[i].equals("morning")) {
				char[] ch1 = ch[i].toCharArray();
				System.out.println(ch1);
			}

		}

		// Counting Number of times Morning Appears
		int count = 0;
		for (int j = 0; j < ch.length; j++) {
			if (ch[j].equals("morning")) {
				count += 1;
				System.out.println("Number of Time Morning words Appears:" + count);
			}

		}

	}

}
