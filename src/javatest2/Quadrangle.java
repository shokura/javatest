package javatest2;

public class Quadrangle extends Figure {

	public Quadrangle(int base, int height) {
		super(base, height);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void show() {
		System.out.println("底辺:" + getBase() + " cm");
		System.out.println("高さ:" + getHeight() + " cm");
		System.out.println("面積" + getArea()+"cm");
	}

	public double getArea() {
		return getBase() * getHeight();

	}
}
