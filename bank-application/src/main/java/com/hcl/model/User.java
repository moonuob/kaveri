package com.hcl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 
 * @author User1
 *
 */
@Entity
@Table(name = "users")
public class User extends ActivityModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String password;
	private String userName;
	private String firstName;
	private String lastName;
	private String address_line1;
	private String address_line2;
	private String address_line3;
	private Integer phone_Number;
	private Integer landline_Number;
	private String permanent;
	private String relationship_Manager;
	private String group_name;
	private String record_Status;
	private String roles;// to do  
	private String region;
	private String branch;
	
	

	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getAddress_line1() {
		return address_line1;
	}




	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}




	public String getAddress_line2() {
		return address_line2;
	}




	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}




	public String getAddress_line3() {
		return address_line3;
	}




	public void setAddress_line3(String address_line3) {
		this.address_line3 = address_line3;
	}




	public Integer getPhone_Number() {
		return phone_Number;
	}




	public void setPhone_Number(Integer phone_Number) {
		this.phone_Number = phone_Number;
	}




	public Integer getLandline_Number() {
		return landline_Number;
	}




	public void setLandline_Number(Integer landline_Number) {
		this.landline_Number = landline_Number;
	}




	public String getPermanent() {
		return permanent;
	}




	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}




	public String getRelationship_Manager() {
		return relationship_Manager;
	}




	public void setRelationship_Manager(String relationship_Manager) {
		this.relationship_Manager = relationship_Manager;
	}




	public String getGroup_name() {
		return group_name;
	}




	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}




	public String getRecord_Status() {
		return record_Status;
	}




	public void setRecord_Status(String record_Status) {
		this.record_Status = record_Status;
	}




	public String getRoles() {
		return roles;
	}




	public void setRoles(String roles) {
		this.roles = roles;
	}




	public String getRegion() {
		return region;
	}




	public void setRegion(String region) {
		this.region = region;
	}




	public String getBranch() {
		return branch;
	}




	public void setBranch(String branch) {
		this.branch = branch;
	}




	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
