package simAnnealing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Queens {
	private int nqueens;
	private int [][] board;
	private int [] positions;
	private List<Move> solution;
	public Queens(int nqueens) {
		this.nqueens = nqueens;
		this.board = new int[nqueens][nqueens];
		this.positions = new int[nqueens];
		this.generateQueens();
		this.solution = new ArrayList<Move>();
		//positions = new int[] {4,5,6,3,4,5,6,5};
		
	}
	
	public void run() {
		//int[][] nextMatrix = getMatrixCollisions();
		//Move next = getNext(nextMatrix);
		//solution.add(new Move(next));
		int last = Integer.MAX_VALUE;
		step(last);
		
	}
	public boolean step(int last) {
		Move next = getNext(getMatrixCollisions());
		System.out.println("last:" + last + " next:" + next.h);
		if(last > next.h) {
			moveQueen(next.row,next.col);
			solution.add(next);
			step(next.h);
		}else {
			solution.add(next);
			return true;
		}
		return false;
		
	}
	public List<Move> getSolution() {
		return solution;
	}
	public int[] getPositions() {
		return this.positions;
	}
	
	private void generateQueens() {

		Random r = new Random();

		for (int i = 0; i < nqueens; i++) {
			positions[i] = r.nextInt(8);
		}
	}
	public void moveQueen(int col, int row) {
		positions[col] = row;
	}
	
	public int[][] getMatrixCollisions(){
		int[] tempPositions = positions.clone();
		int[][] tempBoard = new int[nqueens][nqueens];
		for(int i = 0; i < tempBoard.length; i++) {
			for(int j = 0; j < tempBoard[i].length; j++) {
				moveQueen(i, j);
				tempBoard[i][j] = totalCollisions();
				moveQueen(i, tempPositions[i]);
			}
			
		}
		positions = tempPositions.clone();
		
		return tempBoard;
	}
	
	public int totalCollisions() {
		int c = 0;
		
		for(int i = 0; i < positions.length; i++) {
			c += collision(i, positions[i]);
		}
		
		return c/2;//pares
	}
	
	public int[][] collisions() {
		int[][] tempBoard = new int[nqueens][nqueens];
		for(int i = 0; i < tempBoard.length; i++ ) {
			for(int j = 0; j < tempBoard[i].length; j++) {
				tempBoard[i][j] = collision(i, j);
			}
		}
		return tempBoard;
	}
	private int collision(int col, int row) {
		int c = 0;
		
		for(int i = 0; i < board.length; i++ ) {
			//checa horizontal
			if(hasQueen(i, row)) {
				c++;
			}
			
			for(int j = 0; j < board[i].length; j++) {
				if(Math.abs(col - i) == Math.abs(row - j)) {
					if(hasQueen(i, j)) {
						c++;
					};
				}
			}
			
			
		}
		c--; //tira a prória colisao na linha
		c--;//tira a própria colisao na diagonal
		
		return c;//h refere-se aos pares
	}
	private boolean hasQueen(int col, int row) {
		if(positions[col] == row) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private String pb(int[][] board) {
		StringBuffer result = new StringBuffer();
		String separator = ",";
		result.append("--- start ---\n");
		for (int i = 0; i < board.length; ++i){
		  result.append('[');
		  for (int j = 0; j < board[i].length; ++j)
			  result.append(board[j][i]).append(separator);
		  result.append("]\n");
		}
		result.append("--- end ---");
		
		return result.toString();
	}
	private String pp(int[] position) {
		StringBuffer result = new StringBuffer();
		String separator = ",";
		result.append("--- start ---\n");
		result.append('[');
		for (int i = 0; i < position.length; ++i){  
		  //for (int j = 0; j < position[i].length; ++j)
		  result.append(position[i]).append(separator);
		}
		result.append("]\n");
		result.append("--- end ---");
		
		return result.toString();
	}
	public Move getNext(int[][] board) {
        
        Move move = new Move();
        move.h = board[0][0];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] < move.h ) {
                    move.h = board[i][j];
                    move.row = i;
                    move.col = j;
                    move.matrix = getMatrixCollisions();
                }
            }
        }
        return move ;
    }

}
