package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J02_PrepareStatment {
	
	public static String driverName = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	public static String user = "hr";
	public static String password = "1234";
	
	public static void main(String[] args) {
		
		int a = 2000, b = 3000;
		
		// ���ڿ� + ������ �̿��� �������� ����� ���� ���Ȼ� �ſ� ����ϴ�(��� X)
		// String sql = "select * from employees where salary between " + a + " and " + b;
		
		// prepareStatement�� ? ����� �̿��� ������ ä��� ���� �����ϴ�
		String sql2 = "select * from employees where salary between ? and ?";
		
		try(
				Connection conn = DriverManager.getConnection(url, user, password);				
				PreparedStatement pstmt = conn.prepareStatement(sql2);
		) {
			Class.forName(driverName);
			
			pstmt.setInt(1, a);
			pstmt.setInt(2, b);
			
			
			try(ResultSet rs = pstmt.executeQuery()){
				
				while(rs.next()) {
					System.out.printf("%-8d%15s%15s%10s%8d\n",
							rs.getInt("employee_id"),
							rs.getString("first_name"),
							rs.getString("last_name"),
							rs.getString("job_id"),
							rs.getInt("salary"));
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
