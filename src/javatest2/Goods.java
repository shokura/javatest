package javatest2;

public class Goods {
	private String name;	//	商品名
	private int cost;		//	消費税抜きの価格
	private static double rate;//	消費税率

	public Goods(String n){
		name = n;
		cost = 0;
	}

	public Goods(String n,int c){
		name = n;
		cost = c;
	}

	int getPrice(){

		int add;
		add = (int)(cost*rate+cost);

		return add;
	}

	void show(){
		System.out.println("商品名"+name);
		System.out.println("消費税抜き"+cost);
		System.out.println("消費税率"+rate);
		System.out.println("消費税混みの価格"+getPrice());
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost セットする cost
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return rate
	 */
	public static double getRate() {
		return rate;
	}

	/**
	 * @param rate セットする rate
	 */
	public static void setRate(double rate) {
		Goods.rate = rate;
	}


}
