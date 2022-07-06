import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class D13_Time {
	
	/*
	 * 	# java.time.*
	 * 
	 * 	 - Calendar의 여러가지 단점을 보완한 시간을 다루는 클래스
	 * 	 - Calendar는 set()과 add()를 통해 원본 인스턴스를 계속해서 변경하지만
	 * 	   java.time 패키지의 클래스들은 원본은 그대로 유지하고 새로운 인스턴스를 반환한다
	 * 	 - LocalDate, LocalTime, LocalDateTime
	 *  
	 */
	
	public static void main(String[] args) {
		
		// now() : 현재 시간의 인스턴스를 반환하는 메서드
		System.out.println("날짜만: " + LocalDate.now());
		System.out.println("시간만: " + LocalTime.now());
		System.out.println("날짜와 시간: " + LocalDateTime.now());
		
		// of() : 원하는 시점의 인스턴스를 반환하는 메서드
		System.out.println(LocalDate.of(2002, 5, 10));
		System.out.println(LocalDate.of(2002, Month.APRIL, 3));
		System.out.println(LocalTime.of(13, 53, 32, 232322));
		System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.of(12, 50)));
		System.out.println();
		
		
		LocalDate today = LocalDate.now();
		LocalDate nextYear = today.plusYears(1);
		LocalDate nextMonth = today.plusMonths(-3);
		LocalDate minusDays = today.minusDays(10);
		
		//System.out.println(today.plus(Duration.ofDays(10)));
		System.out.println(today.plus(10, ChronoUnit.MONTHS));
		
		// plusYears 등의 메서드를 사용해도 원본은 변하지 않는다
		System.out.println(today);
		System.out.println(nextYear);
		System.out.println(nextMonth);
		System.out.println(minusDays);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 / EEEE");		
		System.out.println(dtf.format(today));
		
		// 시간 인스턴스 크기 비교
		LocalDate childrensDay = LocalDate.of(2022, 5, 5);		
		System.out.println("오늘이 어린이날 후 인가요? " + today.isAfter(childrensDay));
		System.out.println("오늘이 어린이날 전 인가요? " + today.isBefore(childrensDay));
		
		// 특정 필드값 꺼내기
		DayOfWeek dow = today.getDayOfWeek();
		
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.US));
		System.out.println(dow.getValue());
		
		// with()으로 날짜 세부 조정하기
		//  - TemporalAdjusters에 날짜를 조정할 수 있는 편리한 Adjuster들이 모여있다
		System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
		System.out.println(today.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(today
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
		
	}

}










