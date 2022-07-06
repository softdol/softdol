package quiz;

import java.time.LocalDate;

import myobj.parkingsystem.*;

public class D13_ParkingSystem2 {
	
	public static void main(String[] args) {
		
		Car[] carList = new Car[100];
		for (int i = 0; i < carList.length; i++) {
			//carList[i] = CarFactory.getLimitedTestCar();	//출입 제한 차량 생성
			carList[i] = CarFactory.getRandomTestCar();
		}

		//LocalDate now = LocalDate.of(2022, 5, 5);		//공휴일 체크
		//LocalDate now = LocalDate.of(2023, 9, 28);	//다음 년도 수동 공휴일 체크
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
