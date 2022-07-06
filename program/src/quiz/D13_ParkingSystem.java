package quiz;

import java.time.LocalDate;

//import myobj.parking.*;
import myobj.parkingsystem.Car;
import myobj.parkingsystem.CarFactory;
import myobj.parkingsystem.ParkingSystem;

public class D13_ParkingSystem {
	
	/*
	 * 	차량의 정보를 보고 
	 *  차량 5부제를 적용 했을 때  출입 제한인지 아닌지 판별하는 프로그램을 만들어보세요  
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
//			System.out.println("오늘은 주말이므로 차량 5부제를 시행하지 않습니다.");
//			return;
//		}
//		
//		System.out.printf("오늘은 %s이므로 차량 끝번호 %c, %c번의 출입이 제한됩니다.\n",
//				todayDow.getDisplayName(TextStyle.FULL, Locale.KOREA), limitNUm.charAt(0), limitNUm.charAt(1));
//		
//		if(allowedCarType.contains(car.getCarType())) {
//			System.out.println("장애인, 경차, 유아동승 차량은 차랑5부제의 대상이 아닙니다.");
//			car.setState(1);
//		}else if(limitNUm.contains(car.getLastNum())){
//			System.out.println("차량5부제 대상이므로 출입이 제한됩니다.");
//			car.setState(2);
//		}else {
//			System.out.println("차량5부제 대상이 아닙니다.");
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
			System.out.println("공휴일은 출입 제한이 없습니다.");
		} else {
			for (Car car : carList) {
				ParkingSystem.parkingView(car);
			}
		}
	}
	
	
}
