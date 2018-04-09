package simulatedAnnealing;

public class Queen {
	int x, y;

	public Queen() {

	}

	public Queen(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
        public void moveLeft(){
            y--;
        }
        public void moveRight(){
            y++;
        }

    @Override
    public boolean equals(Object obj) {
        Queen next = (Queen)(obj);
        return (next.x==this.x && next.y==this.y);
    }
        
}
