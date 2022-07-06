package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J04_Transaction {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sql = "insert into coffeefour Values(?, ?, ?, null, ?)";
		System.out.print("몇 개 추가하시겠습니까? ");
		int num = sc.nextInt();
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			// Connection 객체의 AutoCommit 을 해제한 이후 트렌잭션을 직접 관리할 수 있다.
			conn.setAutoCommit(false);
			
			for(int i = 0; i < num; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "커피" + i);
				pstmt.setString(3, "coffee" + i);				
				pstmt.setInt(4, i * 1000);
				
				System.out.printf("%d 행이 추가되었습니다.\n" ,pstmt.executeUpdate());
			}			
			
			System.out.println("저장하시겠습니까? 예(1) 아니오(0)");
			
			switch(sc.nextInt()) {
			case 0:
				conn.rollback();
				break;
			case 1:
				conn.commit();
				break;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
