package things;

public class AppitudePrograms {
	public static void main(String[] args) {

		String quotes = "Hello Good Morning";
		System.out.println(quotes);
		System.out.println(quotes.length());

		// FIND THE LENGTH OF STRING BY USING FOR LOOP AND CHARARRAY()
		char[] quotes1 = quotes.toCharArray(); // COVERTING STRING TO CHAR
		System.out.println(quotes1.length); // PRINT THE CHAR
		for (int i = 0; i < quotes1.length; i++) {
			System.out.print(quotes1[i] + " ");
		}
		// FINDING NUMBER OF WORDS
		System.out.println();
		System.out.println("Number of word:" + quotes.split(" ").length);  //SPLIT THE SENTENCE AND FIND THE LENGTH

		// CONVERTING CHAR[] TO STRING
		String[] quotes2 = quotes.split(" ");    //SPLIT THE SENTENCE BESED ON THE SPACE 
		for (int k = 0; k < quotes2.length; k++) {
			System.out.print(quotes2[k] + " ");
		}

		// REVERSING THE SENTENCE
		System.out.println();
		char[] reverse = quotes.toCharArray(); 
		for (int j = reverse.length - 1; j >= 0; j--) {
			System.out.print(reverse[j] + " ");
		}

		// REVERSING THE PARTICULAR WORD IN THE SENTENCE

		String reversequotes = "";
		String[] quotes3 = quotes.split(" ");
		for (int i = 0; i < quotes3.length; i++) {
			if (quotes3[i].equals("Hello")) {
				char[] reverse1 = quotes3[i].toCharArray();
				for (int j = reverse1.length - 1; j >= 0; j--) {
					reversequotes += reverse1[j];
					System.out.println(reversequotes);
				}
				quotes3[i] = reversequotes;
			}
			// System.out.println(quotes3[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < quotes3.length; i++) {
			System.out.print(quotes3[i] + " ");
		}
	}

}
