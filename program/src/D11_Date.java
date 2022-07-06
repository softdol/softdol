import java.util.Date;

public class D11_Date {
	
	/*
	 * 	# java.util.Date
	 * 
	 * 	 - 자바에서 시간 및 날짜를 다루는 클래스
	 * 	 - 지금은 오래 되어서 메서드는 잘 사용하지 않는다
	 * 	 - 주로 값을 담아놓는 용로도 사용한다
	 *  	
	 * 
	 */
	
	public static void main(String[] args) {
		
		// System.CurrentTimeMillis() : 현재의 유닉스 타임을 구한다
		// ※ 유닉스 타임 - 1970년 1월 1일 이후로 시간이 얼마나 흘렀는지를 1/1000초로 센 것
		System.out.println("현재시간:" + System.currentTimeMillis() + "ms");
		System.out.println("현재시간:" + System.currentTimeMillis() / 1000 + " s");
		System.out.println("현재시간:" + System.currentTimeMillis() / 1000 / 60 + " m");
		System.out.println("현재시간:" + System.currentTimeMillis() / 1000 / 60 / 60 + " h");
		System.out.println("현재시간:" 
					+ System.currentTimeMillis() / 1000 / 60 / 60 / 24 + " days");
		System.out.println("현재시간:" 
					+ System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365 + " years");
		
		// 코드 실행 시간 측정하기
		long begin = System.currentTimeMillis();
		
//		for(int i = 0; i >= 0; i += 1000) {
//			System.out.println(i);
//		}
		
		System.out.println("실행 시간: " + (System.currentTimeMillis() - begin) + "ms");
		
		Date now = new Date();
		
		System.out.println(now);
		
		// Date 클래스의 많은 메서드들은 더 이상 자바가 지원하지 않는다
		Date date = new Date(125, 0, 23);
		
		System.out.println(date);
		System.out.println("현재 시간이 date에 저장된 시간보다 뒤 인가요?" + now.after(date));
		System.out.println("현재 시간이 date에 저장된 시간보다 앞 인가요?" + now.before(date));
		
		// 시간 및 날짜를 다룰 때 long타입을 요구하는 파라미터는 대부분 유닉스 타임을 의미한다
		date.setTime(System.currentTimeMillis());
		System.out.println(date);
		date.setTime(435448354008L);
		System.out.println(date);
		
	}

}




















