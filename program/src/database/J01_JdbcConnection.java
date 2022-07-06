package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JdbcConnection {
	
	/*
	 * 	# JDBC
	 * 
	 * 	 - Java Database Connectvity
	 * 	 - DB�� �������� ������ ������ �� ����� �޾ƿ� �� �ִ� Java API
	 * 	 - �پ��� ������ DB�� ����� �� �ֵ��� ����Ǿ� �ִ�
	 * 	 - Java�� �ҽ� �ڵ�� � ������ DB�� �����ϴ��� �׻� �����ϴ�
	 * 
	 * 	# OJDBC
	 * 
	 * 	 - ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� �������� ���̺귯��
	 * 	 - ����Ŭ DB�� ��ġ�� ������ ���ԵǾ� �ִ�
	 * 	 - SQL Developer ���ο��� ���ԵǾ� �ִ�
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 1. Class.forName()���� jdbc ����̹��� �ε��Ѵ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� �ε� �� ���� �߻�.");
		}
		
		// 2. DriverManager Ŭ������ ���� DB�� �����Ѵ�
		try {
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:XE",
							"hr","1234");
			System.out.println("���� ���� �Ϸ� : " + conn);
			
			// 3. ������ ���� ��ü�� ���� �������� �����Ѵ�
			
			// 3-1. ���� �غ��ϱ�
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees"
					+ " INNER join departments using(department_id)"
					+ " order by employee_id");
			
			// 3-2. ���� �����ϱ�
			ResultSet rs = pstmt.executeQuery();
			
			// 4. �޾ƿ� ����� ����Ѵ�
			while(rs.next()) {
				System.out.printf("%-8d%15s%15s%10s%20s%8d\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("job_id"),
						rs.getString("department_name"),
						rs.getInt("salary"));
			}
			
			// 5. �� ����� ������ �ݾ���� �Ѵ�.			
			rs.close();
			pstmt.close();
			conn.close();			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
	}
	

}










