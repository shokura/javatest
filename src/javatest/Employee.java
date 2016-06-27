package javatest;

public class Employee {

    //フィールド
    private static int number = 0;  //総従業員数
    private int    code;             //従業員番号
    private String name;            //従業員名
    private int    year;            //入社年数
    private int    age;             //年齢

    //コンストラクタの定義
    public Employee(String name,int year,int age){
      this.name = name;
      this.year = year;
      this.age = age;
      code = ++number;      //numberを1つカウントアップする
    }
    //nameに「未定」、yearに「0」、ageに「0」を格納
    public Employee(){
      this("未定",0,0);
    }
    //nameに引数name、yearに「0」、ageに「0」を格納
    public Employee(String name){
      this(name,0,0);
    }
    //nameに引数name、yearに「0」、ageに変数ageを格納
    public Employee(String name,int age){
      this(name,0,age);
    }

    //各フィールドの値を表示するメソッド
    void display(){
      System.out.println("従業員番号："+ code);
      System.out.println("従業員名　："+ name);
      System.out.println("入社年数　："+ year);
      System.out.println("年　　齢　："+ age);
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
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year セットする year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
