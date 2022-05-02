import java.util.ArrayList;

public class Delimiters {
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close) {
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimiterList(String[] tokens) {
		ArrayList<String> x = new ArrayList<String>();
		for(int i = 0; i < tokens.length; i++) {
			if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)) {
				x.add(tokens[i]);
			}
		}
		return x;
	}

	public boolean isBalanced(ArrayList<String> delimiters) {
		int co = 0;
		int cd = 0;
		boolean v = true;
		for(int i = 0; i < delimiters.size(); i++) {
			String z = delimiters.get(i);
			if(z.equals(openDel)) {
				co++;
			} else {
				cd++;
			}
			if(cd > co) {
				v = false;
			}
		}
		return v;
	}
}
