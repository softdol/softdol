package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbcConnection;

public class J05_DisplayEmployeesDetailView {
	
	/*
	 * 	emp_details_view 를 자바 콘솔에 보기 좋게 출력해보세요
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String sql = "select * from emp_details_view";

		try (Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {

			ResultSetMetaData meta = rs.getMetaData();
			
			int colSize = meta.getColumnCount();
			ArrayList<Integer> arrSize = new ArrayList<>();
			ArrayList<String> arrLabel = new ArrayList<>();
			
			for (int i = 1; i <= colSize; i++) {
				
				int size = (int)Math.max(meta.getColumnDisplaySize(i), meta.getColumnLabel(i).length());
				String label = meta.getColumnLabel(i);
				size = label.equals("REGION_NAME") ? 12 : size;
				size = label.equals("COUNTRY_NAME") ? 28 : size;
				size = label.equals("STATE_PROVINCE") ? 15 : size;
				size = label.equals("CITY") ? 23 : size;
				size = label.equals("FIRST_NAME") ? 15 : size;
				size = label.equals("LAST_NAME") ? 15 : size;
				size = label.equals("DEPARTMENT_NAME") ? 18 : size;
				
				arrSize.add(size);
				arrLabel.add(label);
				
				System.out.printf("%"+size+"s┃ ", label);		
			}
			System.out.println("");
			System.out.print("━━━━━━━━━━━╇━━━━━━━━━━━╇━━━━━━━━━━━╇━━━━━━━━━━━━━━╇━━━━━━━━━━━━╇━━━━━");
			System.out.print("━━━━━━╇━━━━━━━━━━━━━━━━╇━━━━━━━━━━━━━━━━╇━━━━━━━━━━━╇━━━━━━━━━━━━━━━╇");
			System.out.print("━━━━━━━━━━━━━━━━━━━╇━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╇━━━━━━━━━━");
			System.out.print("━━━━━━━━━━━━━━╇━━━━━━━━━━━━━━━━╇━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╇");
			System.out.print("━━━━━━━━━━━━━┫");

			System.out.println("");			
			int cnt = 0;
			while(rs.next()) {	
				cnt++;
				for (int i = 1; i <= colSize; i++) {
					int subi = i - 1;
					
					if(i == meta.getColumnCount()) {
						System.out.printf("%"+arrSize.get(subi)+"s┃ ", rs.getString(arrLabel.get(subi)));
					}else {
						System.out.printf("%"+arrSize.get(subi)+"s│ ", rs.getString(arrLabel.get(subi)));
					}
				}
				
				if(cnt < 106) {
				
				System.out.println();
				System.out.print("───────────┼───────────┼───────────┼──────────────┼────────────┼─────");
				System.out.print("──────┼────────────────┼────────────────┼───────────┼───────────────┼");
				System.out.print("───────────────────┼────────────────────────────────────┼──────────");
				System.out.print("──────────────┼────────────────┼─────────────────────────────┼");
				System.out.print("─────────────┨");
				System.out.println();
				}else {
					System.out.println();
					System.out.print("━━━━━━━━━━━┷━━━━━━━━━━━┷━━━━━━━━━━━┷━━━━━━━━━━━━━━┷━━━━━━━━━━━━┷━━━━━");
					System.out.print("━━━━━━┷━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━┷━━━━━━━━━━━┷━━━━━━━━━━━━━━━┷");
					System.out.print("━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━");
					System.out.print("━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┷");
					System.out.print("━━━━━━━━━━━━━┙");
					System.out.println();
				}
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
