package t11_interface1;

public interface Test1 {
	// int max = 1000000;
	int MAX = 1000000;
	public static final int MIN = 0;
	
	void data(); // 둘다 추상메소드
	void data1(int su);
	public abstract void data2();
	
	default void data3() {
		// 실행할 내용을 포함 / 생략
		System.out.println("이곳은 data3메소드(default)");
	}
	
	static void data4() {
		// 실행할 내용을 포함		
		System.out.println("이곳은 data4메소드(static)");
	} 
}
