public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}

	private int hopDistance() {
		return 0;
	}

	public boolean simulate() {
		int cd = 0;
		for(int i = 0; i < maxHops; i++) {
			cd += hopDistance();
			if(cd > maxHops) {
				return true;
			}
		}
		return false;
	}

	public double runSimulations(int num) {
		int passed = 0;
		for(int i = 0; i < num; i++) {
			if(simulate()) {
				passed++;
			}
		}
		return (double) passed / (double) num;
	}
}
