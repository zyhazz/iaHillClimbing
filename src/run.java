import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import boards.Move;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Move> list = new ArrayList<Move>();
		Move move = new Move();
		move.col = 1;
		move.row = 1;
		move.matrix = new int[2][2];
		for(int [] i: move.matrix) {
			System.out.println(Arrays.toString(i));
		}
		list.add(move);
		for(Move i: list) {
			for(int [] j: i.matrix) {
				System.out.println(Arrays.toString(j));
			}
		}
		move = move.clone();
		move.matrix = new int[3][3];
		list.add(move);
		for(Move i: list) {
			for(int [] j: i.matrix) {
				System.out.println(Arrays.toString(j));
			}
		}
		
		
	}

}
