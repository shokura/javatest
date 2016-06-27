package javatest2;

public class Student {

	private String name;
	private int kokugo;
	private int sansu;

	public Student(String name){
		this.name = name;
		this.kokugo = 0;
		this.sansu = 0;
	}

	public Student(String name,int kokugo,int sansu){
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
	}


	public void show(){
		System.out.println("氏名："+name);
		System.out.println("国語："+kokugo);
		System.out.println("算数："+sansu);
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return kokugo
	 */
	public int getKokugo() {
		return kokugo;
	}

	/**
	 * @param kokugo
	 *            セットする kokugo
	 */
	public void setKokugo(int kokugo) {
		this.kokugo = kokugo;
	}

	/**
	 * @return sansu
	 */
	public int getSansu() {
		return sansu;
	}

	/**
	 * @param sansu
	 *            セットする sansu
	 */
	public void setSansu(int sansu) {
		this.sansu = sansu;
	}

}
