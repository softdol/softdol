package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class D12_DiscountDay {
	
	/*
	 * 	� ���Կ��� ���� ��縦 Ȧ����° ����Ͽ��� �����Ѵٰ� �Ѵ�.
	 * 
	 * 	(1) �⵵�� ���� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼���
	 * 
	 * 	(2) �⵵�� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼���
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
		
		// 1. ��, ��, �� ����
		cal.set(year, month - 1, 1);
		
		// 2. ���� ����
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
		// 3. �� ���� �������� ����
		int maxDowim = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		for(int dowim = 1; dowim <= maxDowim ; dowim+=2) {
			cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowim);
			System.out.println(sdf.format(cal.getTime()));
		}
		
		// getActualMaximum() : ���� ���¿��� �ش� �ʵ��� �ִ밪�� �����ش�
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
			System.out.print("�⵵("+pastYear+"~"+nowYear+")�� �Է��� �ּ���>> ");
			year = sc.nextInt();
		}		
		while(month < 1 || month > 12) {
			System.out.print("��(1~12)�� �Է��� �ּ���>> ");
			month = sc.nextInt();
		}
		
		//SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
				
		//getMonth(year, month, myDateFormat);		
		//getYear(year, myDateFormat);
		
		printYearEventDays(year);
		//printMonthEventDays(2022, 2);
		
		sc.close();

	}
	public static void getYear(int year, SimpleDateFormat myDateFormat) {
		Calendar now = Calendar.getInstance();
		now.set(year, 0, 1,0,0,0);
		
		System.out.printf("-----%d�� ���� ��¥-----\n", year);
		
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
		
		System.out.printf("---%d�� %d�� ���� ��¥---\n", year, month);
		
		for(int i = 1 ; i <= day; i++) {
			if(now.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1 && now.get(Calendar.DAY_OF_WEEK) == 5) {				
				System.out.println(myDateFormat.format(now.getTime()));
			}
			now.add(Calendar.DATE, 1);
		}
		
		
	}

}
