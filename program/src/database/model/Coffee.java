package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbcConnection;
import database.PsInsert;

// ������ Ŭ���� �ϳ��� �ν��Ͻ��� DB�� �� ���� ���� �� �ִ�
public class Coffee {
	
	// ������ Ŭ���� ��Ģ 1: �ʵ��� ���������ڴ� private���� �����Ѵ�
	
	private Integer cid;    
	private String kor_name; 
	private String eng_name; 
	private Integer location_id;
	private Integer price;
	//Date PRICE          NUMBER(5)
	
	//������ Ŭ���� ��Ģ 2: ������ �ʿ��� �ʵ�� getter �޼��带 �ް�
	//					������ �ʿ��� �ʵ�� setter �޼��带 �޾��ش�
	
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
	
	//���̹�Ƽ��, ���̹�����Ʈ
	public static boolean add(Connection conn, Coffee coffee) {
		String sql = "insert into coffeeFour values( coffeeFour_cid_seq.nextval, ?, ?, ?, ?)";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, coffee.getKor_name());
			pstmt.setString(2, coffee.getEng_name());
			pstmt.setInt(3, coffee.getLocation_id());
			pstmt.setInt(4, coffee.getPrice());
			// java.util.Date�� java.sql.Date�� ��ȯ�Ͽ� �����ؾ� ��
			// pstmt.setDate(5, new java.sql.Date(coffee.expiry.getTime()));
			// LocalDate�� java.sql.Date�� ��ȯ�ؾ� �ϴ� ���
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
