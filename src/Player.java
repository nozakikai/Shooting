import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener {
	public Player(double x, double y, double vx, double vy) {
		//Characterクラスのコンストラクタ呼び出し（８章）
		super(x, y, vx, vy);
	}

	public void move() {
		super.move();
		if (x < 5)
			x = 5;
		if (x > 365)
			x = 365;
	}

	public void keyPressed(KeyEvent e) {
		if ((e.getKeyCode() == KeyEvent.VK_LEFT) || (e.getKeyCode() == KeyEvent.VK_A)) {
			vx = -5;
		}
		if ((e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_D)) {
			vx = 5;
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if ((e.getKeyCode() == KeyEvent.VK_LEFT) || (e.getKeyCode() == KeyEvent.VK_A)) {
			vx = 0;
		}
		if ((e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_D)) {
			vx = 0;
		}
	}

	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
