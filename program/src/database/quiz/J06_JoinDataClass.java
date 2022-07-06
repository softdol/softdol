package database.quiz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import database.OjdbcConnection;
import database.model.Coffee;
import database.model.CoffeeDetail;
import database.model.Location;

public class J06_JoinDataClass {
	
	/*
	 * 	coffeeFour 테이블과 locations2 테이블 조인 결과의 모든 행을 
	 * 	데이터 클래스에 담아 출력해보세요
	 */
	
	public static void main(String[] args) {
		
		try(
				Connection conn = OjdbcConnection.getConnection();
					
			){
			
			
			List<CoffeeDetail> coffeeDetails = CoffeeDetail.getAll(conn);
			
			for(CoffeeDetail detail : coffeeDetails) {
				System.out.println(detail);
			}
			
			System.out.println("------------------------------------");
			System.out.println(CoffeeDetail.get(conn, 10));
			System.out.println(CoffeeDetail.get(conn, 1));
			
			
			//coffee 테이블에 원하는 데이터 insert	
			if(Coffee.insert(new Coffee("테스트커피","testCoffee",2900,5000))) {
				System.out.println("커피 추가 완료");
			}else{
				System.out.println("커피 추가 실패");
			};			
			//location 테이블에 원하는 데이터 insert
			if(Location.insert(new Location(
					"(test)2014 Jabberwocky Rd",
					"26192",
					"Southlake",
					"Texas",
					"US"))) {
				System.out.println("지역 추가 완료");
			}else{
				System.out.println("지역 추가 실패");
			};
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
