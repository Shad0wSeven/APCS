public class Square {

	public Square(boolean isBlack, int num) {

	}
}

class Crossword {
	private Square[][] puzzle;
	public Crossword(boolean[][] blackSquares) {
		for(int i = 0; i < blackSquares.length; i++) {
			if(blackSquares[i][j]) {
				puzzle[i][j] = new Square(true, 0)
			}
			for(int j = 0; j < blackSquares[0].length; j++) {
				if(toBeLabeled(i, j, blackSquares)) {
					puzzle[i][j] = new Square(true, i+j);
				} else {
					puzzle[i][j] = new Square(false, 0);
				}
			}
		}
	}
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		if(blackSquares[r][c]) {
			return false;
		}
		if(r == 0) {
			return true;
		}
		if(c == 0) {
			return true;
		}
		if(blackSquares[r - 1][c]) {
			return true;
		}
		if(blackSquares[r][c-1]) {
			return true;
		}
		return false;

	}
}
