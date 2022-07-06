
public class C07_StringFormat {
	
	public static void main(String[] args) {
		
		// printf() : 서식을 이용해 출력
		System.out.printf("%d\n", 0x10);
		
		// String.format() : 서식을 이용해 문자열을 생성
		String time = String.format("%d시 %d분 %d초 입니다.", 10, 59, 59);
		System.out.println(time);
		
		String message = getStr();		
		System.out.println(message);
		
	}
	
	public static String getStr() {
		return String.format("오늘의 로또 번호는 [%d, %d, %d, %d, %d, %d, %d]입니다.",
				1,2,3,4,5,6,7);
	}

}
