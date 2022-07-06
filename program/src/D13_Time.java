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
	 * 	 - Calendar�� �������� ������ ������ �ð��� �ٷ�� Ŭ����
	 * 	 - Calendar�� set()�� add()�� ���� ���� �ν��Ͻ��� ����ؼ� ����������
	 * 	   java.time ��Ű���� Ŭ�������� ������ �״�� �����ϰ� ���ο� �ν��Ͻ��� ��ȯ�Ѵ�
	 * 	 - LocalDate, LocalTime, LocalDateTime
	 *  
	 */
	
	public static void main(String[] args) {
		
		// now() : ���� �ð��� �ν��Ͻ��� ��ȯ�ϴ� �޼���
		System.out.println("��¥��: " + LocalDate.now());
		System.out.println("�ð���: " + LocalTime.now());
		System.out.println("��¥�� �ð�: " + LocalDateTime.now());
		
		// of() : ���ϴ� ������ �ν��Ͻ��� ��ȯ�ϴ� �޼���
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
		
		// plusYears ���� �޼��带 ����ص� ������ ������ �ʴ´�
		System.out.println(today);
		System.out.println(nextYear);
		System.out.println(nextMonth);
		System.out.println(minusDays);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� / EEEE");		
		System.out.println(dtf.format(today));
		
		// �ð� �ν��Ͻ� ũ�� ��
		LocalDate childrensDay = LocalDate.of(2022, 5, 5);		
		System.out.println("������ ��̳� �� �ΰ���? " + today.isAfter(childrensDay));
		System.out.println("������ ��̳� �� �ΰ���? " + today.isBefore(childrensDay));
		
		// Ư�� �ʵ尪 ������
		DayOfWeek dow = today.getDayOfWeek();
		
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.US));
		System.out.println(dow.getValue());
		
		// with()���� ��¥ ���� �����ϱ�
		//  - TemporalAdjusters�� ��¥�� ������ �� �ִ� ���� Adjuster���� ���ִ�
		System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
		System.out.println(today.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(today
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
		
	}

}










