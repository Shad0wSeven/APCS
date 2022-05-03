public class HiddenWord {
	private String word;
	public HiddenWord(String correct) {
		word = correct;
	}
	
	public String getHint(String guess) {
		String builder = "";
		for(int i = 0; i < guess.length(); i++) {
			if(guess.charAt(i) == word.charAt(i)) {
				builder += guess.charAt(i);
			} else if(word.indexOf(guess.charAt(i)) != -1) {
				builder += "+";
			} else {
				builder += "*";
			}
		} 
		return builder;
	}

}
