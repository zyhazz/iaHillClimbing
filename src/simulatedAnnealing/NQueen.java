package simulatedAnnealing;

public abstract class NQueen {

	protected int boardSize;
	protected State currentState, nextState;
	protected int tolerancia;

	public NQueen(int boardSize, int tolerancia) {
		this.boardSize = boardSize;
		this.tolerancia = tolerancia;
		if (boardSize < 4)
			throw new UnsupportedOperationException("menor que 3 nao pode");
	}

	abstract public void solve();

	public void show() {
		System.out.println("Custo final: " + currentState.getCost());
		int temp = 0;
		Queen q[] = currentState.getQueens();
		boolean queen = false;
		System.out.println();

		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				for (int k = 0; k < boardSize; k++) {
					if (i == q[k].getX() && j == q[k].getY()) {
						queen = true;
						temp = k;
						break;

					}
				}

				if (queen) {
					// System.out.print("" + temp + "\t");
					System.out.print("X\t");
					queen = false;
				} else {
					System.out.print("*\t");
				}
			}

			System.out.println();
		}
	}

	protected boolean isSolvedPossition(State s) {
		if (s.getCost() <= tolerancia) {
			return true;
		}
		return false;
	}
}
