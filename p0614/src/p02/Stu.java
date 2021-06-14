package p02;

public class Stu {
	String stu_num ="1";
	String pw ="1234";
	String name ="시원";
	String nickName = "쿨";
	
	@Override
	public String toString() {
		String print = stu_num+","+pw+","+name+","+nickName;
		return print;
	}
	
}
