package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.Coffee;

public class J06_DataModelClass {
	
	public static void main(String[] args) {
		
		// DB���� ������ �����ʹ� ���̺��� ��� ������ ���� �� �ִ� ������ �� Ŭ������ �־�δ� ���� ����
		String sql = "select * from coffeeFour";
		
		// �𵨿� ���� �����͸� �÷����� ����� ���ϰ� �ٷ� �� �ִ�
		ArrayList<Coffee> coffees = new ArrayList<Coffee>();
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();			
			){
			
			while(rs.next()) {
				coffees.add(new Coffee(rs));
				//System.out.println(new Coffee(rs));
			}
			
			for(Coffee c : coffees) {
				System.out.println(c);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}	
}
