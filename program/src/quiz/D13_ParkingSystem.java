package quiz;

import java.time.LocalDate;

//import myobj.parking.*;
import myobj.parkingsystem.Car;
import myobj.parkingsystem.CarFactory;
import myobj.parkingsystem.ParkingSystem;

public class D13_ParkingSystem {
	
	/*
	 * 	������ ������ ���� 
	 *  ���� 5������ ���� ���� ��  ���� �������� �ƴ��� �Ǻ��ϴ� ���α׷��� ��������  
	 * 
	 */
	
//	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
//	private static HashSet<CarType> allowedCarType = new HashSet<>();
//	
//	static {
//		limitNumMap.put(DayOfWeek.MONDAY	, "16");
//		limitNumMap.put(DayOfWeek.TUESDAY	, "27");
//		limitNumMap.put(DayOfWeek.WEDNESDAY	, "38");
//		limitNumMap.put(DayOfWeek.THURSDAY	, "49");
//		limitNumMap.put(DayOfWeek.FRIDAY	, "50");
//		
//		allowedCarType.add(Car.babyRide);
//		allowedCarType.add(Car.disabled);
//		allowedCarType.add(Car.lightCard);
//	}
//	
//	public void check(Car car) {		
//		DayOfWeek todayDow = LocalDate.now().getDayOfWeek();
//		
//		String limitNUm = limitNumMap.get(todayDow);
//		if(limitNUm == null) {
//			System.out.println("������ �ָ��̹Ƿ� ���� 5������ �������� �ʽ��ϴ�.");
//			return;
//		}
//		
//		System.out.printf("������ %s�̹Ƿ� ���� ����ȣ %c, %c���� ������ ���ѵ˴ϴ�.\n",
//				todayDow.getDisplayName(TextStyle.FULL, Locale.KOREA), limitNUm.charAt(0), limitNUm.charAt(1));
//		
//		if(allowedCarType.contains(car.getCarType())) {
//			System.out.println("�����, ����, ���Ƶ��� ������ ����5������ ����� �ƴմϴ�.");
//			car.setState(1);
//		}else if(limitNUm.contains(car.getLastNum())){
//			System.out.println("����5���� ����̹Ƿ� ������ ���ѵ˴ϴ�.");
//			car.setState(2);
//		}else {
//			System.out.println("����5���� ����� �ƴմϴ�.");
//			car.setState(1);
//		}
//	}
	
	public static void main(String[] args) {
//		D13_ParkingSystem sys = new D13_ParkingSystem();
//		for(int i  = 0; i < 100; i++) {
//		
//			Car car = CarFactory.getLimitedTestCar();		
//			System.out.println(car);
//		
//			sys.check(car);
//			System.out.println(car);
//			
//			System.out.println("-------------------------------------------------");
//		}	
		
		Car[] carList = new Car[10];
		for (int i = 0; i < carList.length; i++) {
			carList[i] = CarFactory.getRandomTestCar();
		}

		//LocalDate now = LocalDate.of(2022, 5, 5);
		LocalDate now = LocalDate.now();

		if (ParkingSystem.chkDayOff(now)) {
			System.out.println("�������� ���� ������ �����ϴ�.");
		} else {
			for (Car car : carList) {
				ParkingSystem.parkingView(car);
			}
		}
	}
	
	
}
