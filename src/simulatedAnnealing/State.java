package simulatedAnnealing;
import java.util.Random;

abstract class State {

    int boardSize;
    int cost;
    protected Queen q[];

    public State(int boardSize) {
        int i;
        this.boardSize = boardSize;
        q = new Queen[boardSize];

        cost = 0;
    }

    public State(int boardSize, Queen q[]) {
        this.boardSize = boardSize;
        this.q = q;
        cost = 0;
    }

   abstract public State getNextState();

    public void calculateCost() {
        int i, j;
        cost = 0;

        for (i = 0; i < boardSize; i++) {
            for (j = 0; j < boardSize; j++) {
                if (i==j) continue;
                if (q[i].getX() == q[j].getX()
                        || q[i].getY() == q[j].getY()
                        || (q[i].getX() - q[j].getX() == q[i].getY() - q[j].getY()) // diagonal
                        || (q[i].getX() - q[j].getX() == q[j].getY() - q[i].getY())) {
                    cost++;
                }
            }
        }
       //conta duas vezes
        cost = cost / 2;

    }

    public int getCost() {
        calculateCost();
        return cost;
    }

    public Queen[] getQueens() {
        return q;
    }
}