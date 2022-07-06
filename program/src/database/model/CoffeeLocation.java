package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CoffeeLocation implements Comparable<CoffeeLocation> {
	private Integer cid;    
	private String kor_name; 
	private String eng_name; 
	private Integer location_id;
	private Integer price;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	
	public CoffeeLocation(ResultSet rs) throws SQLException {
		cid = rs.getInt(1);    
		kor_name = rs.getString(2);
		eng_name = rs.getString(3);
		location_id = rs.getInt(4);
		price = rs.getInt(5);
		street_address = rs.getString(6);
		postal_code = rs.getString(7);
		city = rs.getString(8);
		state_province = rs.getString(9);
		country_id = rs.getString(10);
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s - %s)\t%d", kor_name, city, street_address, price);
	}

	@Override
	public int compareTo(CoffeeLocation cl) {
		//return this.price.compareTo(cl.price);
		return cl.price.compareTo(this.price);
	}
	
	
}
