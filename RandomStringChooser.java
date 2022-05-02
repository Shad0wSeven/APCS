
// 
// KEEP WORKING ON THIS
// 


public class RandomStringChooser {
	String[] lol;
	int cl;
	public RandomStringChooser(String[] array) {
		lol = array;
	}

	public String getNext() {
		int index = (int) (Math.random()* (double) cl);
		String next = lol[index];
		lol[index] = "NONE";
		for(int i = index; i < lol.length - 1; i++) {
			lol[i] = lol[i+1];
		}
		cl--;
		return next;
	}
}
