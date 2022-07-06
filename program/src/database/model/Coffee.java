package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbcConnection;
import database.PsInsert;

// 데이터 클래스 하나의 인스턴스가 DB의 한 행을 담을 수 있다
public class Coffee {
	
	// 데이터 클래스 규칙 1: 필드의 접근제어자는 private으로 설정한다
	
	private Integer cid;    
	private String kor_name; 
	private String eng_name; 
	private Integer location_id;
	private Integer price;
	//Date PRICE          NUMBER(5)
	
	//데이터 클래스 규칙 2: 접근이 필요한 필드는 getter 메서드를 달고
	//					수정이 필요한 필드는 setter 메서드를 달아준다
	
	public Integer getCid() {
		return cid;
	}
	
	public String getEng_name() {
		return eng_name;
	}
	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}
	
	public String getKor_name() {
		return kor_name;
	}
	
	public Integer getLocation_id() {
		return location_id;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setKor_name(String kor_name) {
		this.kor_name = kor_name;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Coffee(String kor_name, String eng_name, int location_id, int price) {
		this.kor_name		= kor_name; 
		this.eng_name 		= eng_name; 
		this.location_id	= location_id;
		this.price 			= price;
	}

	public Coffee(ResultSet rs) throws SQLException {
		cid			= rs.getInt("cid");    
		kor_name 	= rs.getString("kor_name"); 
		eng_name 	= rs.getString("eng_name"); 
		location_id = rs.getInt("location_id");
		price 		= rs.getInt("price");
	}
	
	public static boolean insert(Coffee coffee) {
		String sql = "insert into coffeeFour values( coffeeFour_cid_seq.nextval, ?, ?, ?, ?)";
		
		ArrayList<PsInsert> psList = new ArrayList<>();
		
		psList.add(new PsInsert('S', coffee.kor_name));
		psList.add(new PsInsert('S', coffee.eng_name));
		psList.add(new PsInsert('I', String.valueOf(coffee.location_id)));
		psList.add(new PsInsert('I', String.valueOf(coffee.price)));
				
		return OjdbcConnection.insertInt(sql, psList);
	}
	
	//마이바티스, 하이버네이트
	public static boolean add(Connection conn, Coffee coffee) {
		String sql = "insert into coffeeFour values( coffeeFour_cid_seq.nextval, ?, ?, ?, ?)";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, coffee.getKor_name());
			pstmt.setString(2, coffee.getEng_name());
			pstmt.setInt(3, coffee.getLocation_id());
			pstmt.setInt(4, coffee.getPrice());
			// java.util.Date를 java.sql.Date로 변환하여 전달해야 함
			// pstmt.setDate(5, new java.sql.Date(coffee.expiry.getTime()));
			// LocalDate를 java.sql.Date로 변환해야 하는 경우
			// pstmt.setDate(5, java.sql.Date.valueOf(LocalDate.now()));
			return pstmt.executeUpdate(sql) > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d)", kor_name, price);
	}
}
