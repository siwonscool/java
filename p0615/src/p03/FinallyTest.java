package p03;

public class FinallyTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTrmpFiles();
		}catch(Exception e) {
			e.printStackTrace();
			deleteTrmpFiles();
		}
	}

	private static void deleteTrmpFiles() {
		// TODO Auto-generated method stub
		
	}

	private static void copyFiles() {
		// TODO Auto-generated method stub
		
	}

	private static void startInstall() {
		// TODO Auto-generated method stub
		
	}

}
