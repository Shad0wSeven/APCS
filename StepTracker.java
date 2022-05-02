public class StepTracker {
	int ms, days, tsteps, activedays;

	public StepTracker(int minSteps) {
		ms = minSteps;
	}

	public int activeDays() {
		return activedays;
	}

	public void addDailySteps(int steps) {
		days++;
		tsteps += steps;
		if(steps >= ms) {
			activedays++;
		}
	}

	public double averageSteps() {
		return (double) tsteps / (double) days;
	}


}
