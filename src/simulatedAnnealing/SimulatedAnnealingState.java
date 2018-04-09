package simulatedAnnealing;

import java.util.Random;

public class SimulatedAnnealingState extends State {

	Random randomGenerator = new Random();

	public SimulatedAnnealingState(int boardSize) {
		super(boardSize);
		for (int i = 0; i < boardSize; i++) {
			q[i] = new Queen(i, randomGenerator.nextInt(boardSize));
		}
	}

	public SimulatedAnnealingState(int boardSize, Queen q[]) {
		super(boardSize);
		this.q = q;
		cost = 0;
	}

	@Override
	public State getNextState() {
		int i;
		Queen nextStateQueen[] = new Queen[boardSize];
		// pega uma rainha aleatoria
		int rand = randomGenerator.nextInt(boardSize);

		for (i = 0; i < boardSize; i++) {
			nextStateQueen[i] = new Queen(q[i].getX(), q[i].getY());

			if (rand == i) {
				int temp = randomGenerator.nextInt(boardSize);
				// garantir que o proximo estado != estado atual
				while (temp == q[i].getY()) {
					temp = randomGenerator.nextInt(boardSize);
				}
				// new state will be added to the new state
				nextStateQueen[i] = new Queen(q[i].getX(), temp);
			}
		}

		return new SimulatedAnnealingState(boardSize, nextStateQueen);
	}
}