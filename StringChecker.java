public interface StringChecker {
	boolean isValid(String str);
}

class CodeWordChecker implements StringChecker {
	private String mn;
	private int maxL;
	private int minL;
	public CodeWordChecker(String x) {
		maxL = 20;
		minL = 6;	
	}

	@Override
	public boolean isValid(String str) {
		// TODO Auto-generated method stub
		return false;
	}

}