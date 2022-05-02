public class LightBoard {
	private boolean [][] lights;
	public LightBoard(int numRows, int numCols) {
		lights = new boolean[numRows][numCols];
		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numCols; j++) {
				int prob = (int) (Math.random()*100.0) + 1;
				if(prob >= 60) {
					lights[i][j] = true;
				} else {
					lights[i][j] = false;
				}
			}
		}
	}
	public boolean evaluateLight(int row, int col) {
		if(lights[row][col] == true) {

		}
		return false;
	}
}
