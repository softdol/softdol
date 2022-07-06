package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbcConnection;
import database.PsInsert;

public class Location {
	
	private Integer location_id;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	
	public Location(String street_address, String postal_code, 
			        String city, String state_province, String country_id) {
		this.street_address	= street_address;
		this.postal_code	= postal_code;
		this.city			= city;
		this.state_province	= state_province;
		this.country_id		= country_id;
	}
	
	public Location(ResultSet rs) throws SQLException {
		location_id		= rs.getInt("location_id");
		street_address	= rs.getString("street_address");
		postal_code 	= rs.getString("postal_code");
		city 			= rs.getString("city");
		state_province 	= rs.getString("state_province");
		country_id 		= rs.getString("country_id");
	}
	
	// ¿ìÅ¬¸¯ -> Source -> Generate Getters and Setters
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState_province() {
		return state_province;
	}
	public void setState_province(String state_province) {
		this.state_province = state_province;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	
	public static boolean insert(Location location) {
		String sql = "insert into locations2 values( locations2_location_id_seq.nextval";
			   sql += ", ?, ?, ?, ?, ?)";
		
		ArrayList<PsInsert> psList = new ArrayList<>();
		
		psList.add(new PsInsert('S', location.street_address));
		psList.add(new PsInsert('S', location.postal_code));
		psList.add(new PsInsert('S', location.city));
		psList.add(new PsInsert('S', location.state_province));
		psList.add(new PsInsert('S', location.country_id));
				
		return OjdbcConnection.insertInt(sql, psList);
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s), %s", street_address, postal_code, city);
	}
	
}
