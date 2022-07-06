package myobj.parkingsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;

public class CarFactory {
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	static String[] strMiddle = { "��", "��", "��", "��", "��", "ȣ", "Ÿ", "��", "��" };
	static {
		limitNumMap.put(DayOfWeek.MONDAY	, "16");
		limitNumMap.put(DayOfWeek.TUESDAY	, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY	, "38");
		limitNumMap.put(DayOfWeek.THURSDAY	, "49");
		limitNumMap.put(DayOfWeek.FRIDAY	, "50");
	}
	
	/**
	 * ���� ���� �׽�Ʈ �� ����
	 * @return
	 */
	public static Car getLimitedTestCar() {		
		DayOfWeek dow = LocalDate.now().getDayOfWeek();		
		String limitNum = limitNumMap.get(dow);
		
		if(limitNum == null) {
			System.out.println("������ ���� ������ ���� �� ��� ���� ������ �����մϴ�.");
			return getRandomTestCar();
		}
		String tempS = "0000" + (int) (Math.random() * 10000);
		tempS = tempS.substring(tempS.length() - 3) + limitNum.charAt((int)(Math.random()*2));
		tempS = (int) (Math.random() * 899 + 10) 
				+ strMiddle[(int) (Math.random() * strMiddle.length)] + tempS;
		
		return new Car(tempS,
				(int)(Math.random() * 4));
	}
	
	/**
	 * �׽�Ʈ �� ����
	 * @return
	 */
	public static Car getRandomTestCar() {		
		String tempS = "0000" + (int) (Math.random() * 10000);
		tempS = tempS.substring(tempS.length() - 4);
		tempS = (int) (Math.random() * 899 + 10) + strMiddle[(int) (Math.random() * strMiddle.length)] + tempS;
		
		return new Car(tempS,
				(int)(Math.random() * 4));
	}

}
