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
	 * 	coffeeFour ���̺�� locations2 ���̺� ���� ����� ��� ���� 
	 * 	������ Ŭ������ ��� ����غ�����
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
			
			
			//coffee ���̺� ���ϴ� ������ insert	
			if(Coffee.insert(new Coffee("�׽�ƮĿ��","testCoffee",2900,5000))) {
				System.out.println("Ŀ�� �߰� �Ϸ�");
			}else{
				System.out.println("Ŀ�� �߰� ����");
			};			
			//location ���̺� ���ϴ� ������ insert
			if(Location.insert(new Location(
					"(test)2014 Jabberwocky Rd",
					"26192",
					"Southlake",
					"Texas",
					"US"))) {
				System.out.println("���� �߰� �Ϸ�");
			}else{
				System.out.println("���� �߰� ����");
			};
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
