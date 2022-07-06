package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class D12_DiscountDay {
	
	/*
	 * 	어떤 가게에서 할인 행사를 홀수번째 목요일에만 진행한다고 한다.
	 * 
	 * 	(1) 년도와 월을 입력하면 해당 월의 모든 할인 날짜를 출력해주는 메서드
	 * 
	 * 	(2) 년도를 입력하면 해당 년의 모든 할인 날짜를 출력해주는 메서드
	 * 
	 */
	
	public static void printYearEventDays(int year) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
		
		Calendar cal = Calendar.getInstance();
		int month = 0;
		
		while(cal.get(Calendar.YEAR) == year) {
			cal.set(year, month++ , 1);
//			cal.set(year, cal.get(month) , 1);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
			int maxDowim = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
			for(int dowim = 1; dowim <= maxDowim ; dowim+=2) {
				cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowim);
				System.out.println(sdf.format(cal.getTime()));
			}
		}
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
//		
//		Calendar cal = Calendar.getInstance();
//		
//		cal.set(year, 0, 1, 0, 0, 0);
//		
//		int thurCnt = 1;
//		while(cal.get(Calendar.YEAR) == year) {
//			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
//				if(thurCnt % 2 == 1) {
//					System.out.println(sdf.format(cal.getTime()) + " : " + thurCnt);
//				}
//				thurCnt++;
//			}
//			int month = cal.get(Calendar.MONTH);
//			cal.add(Calendar.DATE, 1);
//			if(month != cal.get(Calendar.MONTH)) {
//				thurCnt = 1;
//			}
//		}
	}
	
	public static void printMonthEventDays(int year, int month) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
		
		Calendar cal = Calendar.getInstance();
		
		// 1. 년, 월, 일 설정
		cal.set(year, month - 1, 1);
		
		// 2. 요일 설정
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
		// 3. 몇 번쨰 요일인지 설정
		int maxDowim = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		for(int dowim = 1; dowim <= maxDowim ; dowim+=2) {
			cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowim);
			System.out.println(sdf.format(cal.getTime()));
		}
		
		// getActualMaximum() : 현재 상태에서 해당 필드의 최대값을 구해준다
		// System.out.println(cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
		//System.out.println(cal.getActualMaximum(Calendar.DATE));
		
	}	
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		int month = 0;
		
		year = 2022;
		month = 3;
		
		int nowYear = Calendar.getInstance().get(Calendar.YEAR) + 1;
		int pastYear = 2000;
		
		while(year < pastYear || year > nowYear ) {
			System.out.print("년도("+pastYear+"~"+nowYear+")를 입력해 주세요>> ");
			year = sc.nextInt();
		}		
		while(month < 1 || month > 12) {
			System.out.print("월(1~12)을 입력해 주세요>> ");
			month = sc.nextInt();
		}
		
		//SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
				
		//getMonth(year, month, myDateFormat);		
		//getYear(year, myDateFormat);
		
		printYearEventDays(year);
		//printMonthEventDays(2022, 2);
		
		sc.close();

	}
	public static void getYear(int year, SimpleDateFormat myDateFormat) {
		Calendar now = Calendar.getInstance();
		now.set(year, 0, 1,0,0,0);
		
		System.out.printf("-----%d년 할인 날짜-----\n", year);
		
		for(int i = 1 ; i < 365; i++) {
			if(now.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1 && now.get(Calendar.DAY_OF_WEEK) == 5) {				
				System.out.println(myDateFormat.format(now.getTime()));
			}
			now.add(Calendar.DATE, 1);
		}
	}
	
	public static void getMonth(int year, int month, SimpleDateFormat myDateFormat) {
		Calendar now = Calendar.getInstance();
		
		now.set(year, month-1, 1,0,0,0);
		
		int day = now.getActualMaximum(Calendar.DATE);
		
		System.out.printf("---%d년 %d월 할인 날짜---\n", year, month);
		
		for(int i = 1 ; i <= day; i++) {
			if(now.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1 && now.get(Calendar.DAY_OF_WEEK) == 5) {				
				System.out.println(myDateFormat.format(now.getTime()));
			}
			now.add(Calendar.DATE, 1);
		}
		
		
	}

}
