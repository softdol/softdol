package myobj.parking;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;

public class CarFactory {
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	
	static {
		limitNumMap.put(DayOfWeek.MONDAY	, "16");
		limitNumMap.put(DayOfWeek.TUESDAY	, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY	, "38");
		limitNumMap.put(DayOfWeek.THURSDAY	, "49");
		limitNumMap.put(DayOfWeek.FRIDAY	, "50");
	}
	
	static CarType[] types = { Car.babyRide, Car.disabled, Car.lightCard,
			Car.normal, Car.normal, Car.normal, Car.normal, Car.normal};
	
	public static Car getLimitedTestCar() {
		String carNum = "12��123";		
		DayOfWeek dow = LocalDate.now().getDayOfWeek();		
		String limitNum = limitNumMap.get(dow);
		
		if(limitNum == null) {
			System.out.println("������ ���� ������ ���� �� ��� ���� ������ �����մϴ�.");
			return getRandomTestCar();
		}
		
		return new Car(carNum + limitNum.charAt((int)(Math.random()*2)),
				types[(int)(Math.random() * types.length)]);
	}
	
	public static Car getRandomTestCar() {		
		String carNum = "12��123";
		
		return new Car(carNum + (int)(Math.random() * 10),
				types[(int)(Math.random() * types.length)]);
	}

}
