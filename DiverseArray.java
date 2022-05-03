public class DiverseArray {
	
	// a
	public static int arraySum(int[] arr) {
		int sum = 0;
		for(int x : arr) {
			sum += x;
		}
		return sum;
	}
	
	// b
	public static int[] rowSums(int[][] arr2D) {
		int[] x = new int[arr2D.length];
		for(int i = 0; i < arr2D.length; i++) {
			int z = 0;
			for(int v : arr2D[i]) {
				z+= v;
			}
			x[i] = z;
		}
		return x;
	}
	
	// c
	
	public static boolean isDiverse(int[][] arr2D) {
		int[] v = rowSums(arr2D);
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = i; i < arr2D.length; j++) {
				if(v[i] == v[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
}
