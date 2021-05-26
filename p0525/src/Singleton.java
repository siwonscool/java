
public class Singleton {
	private static Singleton s = new Singleton();
	static int count;
	private int stu_num = ++count;
	private String name;

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Singleton() {
	}

	static Singleton getInstance() {
		if (s == null) {
			return s = new Singleton();
		}
		return s; // 싱글톤 클래스 내부에 private static 인스턴스를생성해 하나의 객체에 하나의 인스턴스만 생성할수 있게 하는것 
	}
}
