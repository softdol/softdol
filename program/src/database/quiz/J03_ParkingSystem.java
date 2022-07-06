package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import database.OjdbcConnection;
//import myobj.parking.*;
import myobj.parkingsystem.Car;
import myobj.parkingsystem.CarFactory;
import myobj.parkingsystem.ParkingSystem;


public class J03_ParkingSystem {
	
	/*
	 * 	������ ������ ���� 
	 *  ���� 5������ ���� ���� ��  ���� �������� �ƴ��� �Ǻ��� DB�� ����� ������  
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		parkingIns();
		
		parkingList("");		
		//parkingList("N");		
		//parkingList("Y");
		
	}
	
	public static void parkingList(String chk) {
		String sql = "select c.car_num, t.car_text, c.car_available, c.car_memo, car_type";
		sql += " from parking_list c";
		sql += " inner join parking_car_type t using(car_type)";
		sql += chk.length() > 0 ? " where c.car_available = ?" : ""; 
		sql += " order by c.idx";

		try (Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			) {
			if (chk.length() > 0) {
				pstmt.setString(1, chk);
			}
			
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					System.out.printf("%9s%s%s%s\n", rs.getString(1),
							rs.getString(3).equals("Y") ? " [���԰���]" : " XX��������XX",
							rs.getString(3).equals("Y") ? "" : " (" + rs.getString(4) + ")",
							rs.getInt(5) == 0 ? "" : " <" + rs.getString(2) + ">");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void parkingIns() {
		
		Car[] carList = new Car[10];
		for (int i = 0; i < carList.length; i++) {
			carList[i] = CarFactory.getLimitedTestCar();
		}
		
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
