package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class J05_MetaData {
	
	public static void main(String[] args) {
		
		String sql = "select * from employees";
		
		try(
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			// ResultSetMetaData : �ش� ���� ���� ����� ���� ���� ������ ��� �ִ� ������
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("�÷��� ����?" + meta.getColumnCount() + "��");
			
			for(int i = 1; i <= meta.getColumnCount(); i++) {
				System.out.printf("%d��° �÷��� �̸�: %s\n", i, meta.getColumnLabel(i));
				System.out.printf("�÷��� ũ��: %d\n", meta.getColumnDisplaySize(i));
				System.out.printf("�÷��� Ÿ��: %s\n", meta.getColumnTypeName(i));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
