public interface NumberGroup {
	public boolean contains(int test);

	
}


class Range implements NumberGroup {
	int x, y;
	public Range(int a, int b) {
		x = a;
		y = b;
	}
	
	@Override
	public boolean contains(int test) {
		return (test >= x && test <= y) 
	}
}