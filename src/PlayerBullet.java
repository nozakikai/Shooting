
public class PlayerBullet extends Character {
	public PlayerBullet(double x, double y, double vx, double vy) {
		//Characterクラスのコンストラクタ呼び出し（８章）
		super(x, y, vx, vy);
	}

	public void draw(MyFrame f) {
		f.setColor(255, 255, 0);
		f.fillRect(x, y, 10, 30);
	
	}

}
