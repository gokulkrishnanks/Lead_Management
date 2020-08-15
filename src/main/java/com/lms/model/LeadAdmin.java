package com.lms.model;



import java.util.Date;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

public class LeadAdmin {
	private String source_type;
	private String source_name;
	private String source_id;
	private String lead_id;
	private String full_name;
	private String nic1;
	private String nic2;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String Primarycontact_no;
	private String alternate_no;
	private String province;
	private String district;
	private String divison;
	private String city;
	private String address1;
	private String address2;
	private String product1;
	private String range1;
	private String product2;
	private String range2;
	private String product3;
	private String range3;
	private String region_name;
	private String region_code;
	private String branch_name;
	private String branch_code;
	private String assign_to;
	private String employee_name;
	private String status;
	
	private Map<String,String> source_map;
	
	
	public LeadAdmin() {
		super();
	}
	public Map<String, String> getSource_map() {
		return source_map;
	}
	public void setSource_map(Map<String, String> source_map) {
		this.source_map = source_map;
	}
	public String getSource_type() {
		return source_type;
	}
	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}
	public String getSource_name() {
		return source_name;
	}
	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}
	public String getSource_id() {
		return source_id;
	}
	public void setSource_id(String source_id) {
		this.source_id = source_id;
	}
	public String getLead_id() {
		return lead_id;
	}
	public void setLead_id(String lead_id) {
		this.lead_id = lead_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getNic1() {
		return nic1;
	}
	public void setNic1(String nic1) {
		this.nic1 = nic1;
	}
	public String getNic2() {
		return nic2;
	}
	public void setNic2(String nic2) {
		this.nic2 = nic2;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPrimarycontact_no() {
		return Primarycontact_no;
	}
	public void setPrimarycontact_no(String primarycontact_no) {
		Primarycontact_no = primarycontact_no;
	}
	public String getAlternate_no() {
		return alternate_no;
	}
	public void setAlternate_no(String alternate_no) {
		this.alternate_no = alternate_no;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDivison() {
		return divison;
	}
	public void setDivison(String divison) {
		this.divison = divison;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getProduct1() {
		return product1;
	}
	public void setProduct1(String product1) {
		this.product1 = product1;
	}
	public String getRange1() {
		return range1;
	}
	public void setRange1(String range1) {
		this.range1 = range1;
	}
	public String getProduct2() {
		return product2;
	}
	public void setProduct2(String product2) {
		this.product2 = product2;
	}
	public String getRange2() {
		return range2;
	}
	public void setRange2(String range2) {
		this.range2 = range2;
	}
	public String getProduct3() {
		return product3;
	}
	public void setProduct3(String product3) {
		this.product3 = product3;
	}
	public String getRange3() {
		return range3;
	}
	public void setRange3(String range3) {
		this.range3 = range3;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public String getAssign_to() {
		return assign_to;
	}
	public void setAssign_to(String assign_to) {
		this.assign_to = assign_to;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LeadAdmin(String source_type, String source_name, String source_id, String lead_id, String full_name,
			String nic1, String nic2, String gender, Date dob, String primarycontact_no, String alternate_no,
			String province, String district, String divison, String city, String address1, String address2,
			String product1, String range1, String product2, String range2, String product3, String range3,
			String region_name, String region_code, String branch_name, String branch_code, String assign_to,
			String employee_name, String status) {
		super();
		this.source_type = source_type;
		this.source_name = source_name;
		this.source_id = source_id;
		this.lead_id = lead_id;
		this.full_name = full_name;
		this.nic1 = nic1;
		this.nic2 = nic2;
		this.gender = gender;
		this.dob = dob;
		Primarycontact_no = primarycontact_no;
		this.alternate_no = alternate_no;
		this.province = province;
		this.district = district;
		this.divison = divison;
		this.city = city;
		this.address1 = address1;
		this.address2 = address2;
		this.product1 = product1;
		this.range1 = range1;
		this.product2 = product2;
		this.range2 = range2;
		this.product3 = product3;
		this.range3 = range3;
		this.region_name = region_name;
		this.region_code = region_code;
		this.branch_name = branch_name;
		this.branch_code = branch_code;
		this.assign_to = assign_to;
		this.employee_name = employee_name;
		this.status = status;
	}
	
	

}
