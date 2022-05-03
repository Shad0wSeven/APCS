import java.util.List;

public class SparseArray {
	private int numRows;
	private int numCols;
	
	private List<SparseArrayEntry> entries;
	
	public int getNumRows() {
		return numRows;
	}

	public int getNumCols() {
		return numCols;
	}
	
	// a 

	public int getValueAt(int row, int col) {
		for(int i = 0; i < entries.size(); i++) {
			if(entries.get(i).getCol() == col && entries.get(i).getCol() == row) {
				return entries.get(i).getValue();
			}
		}
		return 0;
	}

	// b

	public void removeColumn(int col) {
		for(SparseArrayEntry v : entries) {
			
			if(v.getCol() == col)
				entries.remove(v);
			
			if(v.getCol() > col) {
				entries.add(new SparseArrayEntry(v.getRow(), v.getCol() - 1 , v.getValue()));
				entries.remove(v);
			}

		}
	}

}
