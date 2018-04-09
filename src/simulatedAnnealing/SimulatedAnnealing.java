package simulatedAnnealing;

public class SimulatedAnnealing extends NQueen {

	private double temp;
	private int resfriamento;

	public SimulatedAnnealing(int boardSize, int tolerancia, double temp, int resfriamento) {
		super(boardSize, tolerancia);
		this.temp = temp;
		currentState = new SimulatedAnnealingState(boardSize);
	}

	@Override
	public void solve() {
		while (!isSolvedPossition(currentState)) {
			double temperature;
			double delta;
			double probability;
			double rand;

			for (temperature = this.temp; (temperature > 0) && (currentState.getCost() != 0); temperature -= resfriamento) {
				nextState = currentState.getNextState();
				delta = currentState.getCost() - nextState.getCost();
				probability = Math.exp(delta / temperature);
				//probability = delta / temperature;
				//System.out.println("P: " + probability);
				rand = Math.random();

				if (delta > 0) {
					currentState = nextState;
				} else if (rand <= probability) {
					currentState = nextState;
				}
			}
		}
	}
}