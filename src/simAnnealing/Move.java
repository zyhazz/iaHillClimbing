package simAnnealing;

public class Move {
	public int row;
	public int col;
	public int h;
	public int[][] matrix;
	public Move(int row, int col, int h, int[][] matrix){
		this.row = row;
		this.col = col;
		this.h = h;
		this.matrix = matrix;
	}
	public Move() {
		
	}
	public Move(Move next) {
		// TODO Auto-generated constructor stub
		this.row = next.row;
		this.col = next.col;
		this.h = next.h;
		this.matrix = next.matrix;
	}
}
