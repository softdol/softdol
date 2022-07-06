package myobj.parkingsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import database.OjdbcConnection;
import database.PsInsert;

public class ParkingSystem {

	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	private static ArrayList<LocalDate> dayoffList = new ArrayList<>(); 
	
	static {		
		limitNumMap.put(DayOfWeek.MONDAY	, "16");
		limitNumMap.put(DayOfWeek.TUESDAY	, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY	, "38");
		limitNumMap.put(DayOfWeek.THURSDAY	, "49");
		limitNumMap.put(DayOfWeek.FRIDAY	, "50");
		
		// ��� ������ �ش� �⵵���� ����ǰ� ����
		dayoffList.add(LocalDate.of(LocalDate.now().getYear(), 1, 1));
		dayoffList.add(LocalDate.of(LocalDate.now().getYear(), 3, 1));
		dayoffList.add(LocalDate.of(LocalDate.now().getYear(), 5, 5));
		dayoffList.add(LocalDate.of(LocalDate.now().getYear(), 6, 6));
		dayoffList.add(LocalDate.of(LocalDate.now().getYear(), 8, 15));
		dayoffList.add(LocalDate.of(LocalDate.now().getYear(), 10, 3));
		dayoffList.add(LocalDate.of(LocalDate.now().getYear(), 10, 9));
		dayoffList.add(LocalDate.of(LocalDate.now().getYear(), 12, 25));
		
		// ���� ���� ���� �Է�(2���)
		dayoffList.add(LocalDate.of(2022, 1, 31));	//1.31/2.2 ��
		dayoffList.add(LocalDate.of(2022, 2, 1));
		dayoffList.add(LocalDate.of(2022, 2, 2));		
		dayoffList.add(LocalDate.of(2022, 3, 9));	//3.9 ����� ����
		dayoffList.add(LocalDate.of(2022, 5, 8));	//5.8 ��ź��
		dayoffList.add(LocalDate.of(2022, 6, 1));	//6.1 ���漱��
		dayoffList.add(LocalDate.of(2022, 9, 9));	//9.9~9.11 + 9.12 �߼�+��ü
		dayoffList.add(LocalDate.of(2022, 9, 10));
		dayoffList.add(LocalDate.of(2022, 9, 11));
		dayoffList.add(LocalDate.of(2022, 9, 12));		
		dayoffList.add(LocalDate.of(2022, 10, 10));	//10.10 �ѱ۳� ��ü
		// 2023
		dayoffList.add(LocalDate.of(2023, 1, 21));	//1.21~24 ���� + ��ü
		dayoffList.add(LocalDate.of(2023, 1, 22));
		dayoffList.add(LocalDate.of(2023, 1, 23));
		dayoffList.add(LocalDate.of(2023, 1, 24));
		dayoffList.add(LocalDate.of(2023, 5, 27));	//5.27 ��ź��
		dayoffList.add(LocalDate.of(2023, 9, 28));	//9.28~30 �߼�
		dayoffList.add(LocalDate.of(2023, 9, 29));
		dayoffList.add(LocalDate.of(2023, 9, 30));
	}
	
	public static boolean chkDayOff(LocalDate now) {
		return dayoffList.contains(now);
	}

	public static boolean chkExcept(int type) {
		return type == 0 ? true : false;
	}

	public static boolean chkNumber(String number) {
		DayOfWeek todayDow = LocalDate.now().getDayOfWeek();		
		String limitNUm = limitNumMap.get(todayDow);
		String lastNum  = number.substring(number.length() - 1);
		
		return limitNUm.contains(lastNum);		
	}
	
	public static void parkingView(Car car) {
		String memo = "";
		String available = "Y";
		if(!chkNumber(car.getNumber())) {
			memo = "5���� ��� �ƴ�";
		}else {
			if(chkExcept(car.getType())) {
				memo = "5���� ���";
				available = "N";
			}else {
				memo = "5���� ��� ����";
			}
		}
		
		String sql = "insert into parking_list values( parking_list_idx_seq.nextval, ?, ?, ?, ?, sysdate, null)";
		
		ArrayList<PsInsert> psList = new ArrayList<>();
		
		psList.add(new PsInsert('S', car.getNumber()));
		psList.add(new PsInsert('I', String.valueOf(car.getType())));
		psList.add(new PsInsert('S', available));
		psList.add(new PsInsert('S', memo));
		
		OjdbcConnection.insert(sql, psList);
	}

}
