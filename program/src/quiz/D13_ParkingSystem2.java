package quiz;

import java.time.LocalDate;

import myobj.parkingsystem.*;

public class D13_ParkingSystem2 {
	
	public static void main(String[] args) {
		
		Car[] carList = new Car[100];
		for (int i = 0; i < carList.length; i++) {
			//carList[i] = CarFactory.getLimitedTestCar();	//���� ���� ���� ����
			carList[i] = CarFactory.getRandomTestCar();
		}

		//LocalDate now = LocalDate.of(2022, 5, 5);		//������ üũ
		//LocalDate now = LocalDate.of(2023, 9, 28);	//���� �⵵ ���� ������ üũ
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
