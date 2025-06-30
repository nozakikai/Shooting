
public class SquareEnemy extends Enemy {
	public SquareEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life = 1 + GameWorld.stage;
		score = 3;
	}

	public void move() {
		super.move();

		 if (x > 365) {
		        x = 365;
		        vx = -Math.abs(vx);
		    }

		    if (x < 5) {
		        x = 5;
		        vx = Math.abs(vx);
		    }
	}

	public void draw(MyFrame f) {
		f.setColor(255, 166, 0);
		f.fillRect(x, y, 10, 10);
		f.fillRect(x + 20, y, 10, 10);
		f.fillRect(x, y + 20, 10, 10);
		f.fillRect(x + 20, y + 20, 10, 10);

		f.setColor(255, 0, 0);
		f.fillRect(x + 10, y + 10, 10, 10);
	}
}
