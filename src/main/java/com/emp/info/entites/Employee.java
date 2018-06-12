package com.emp.info.entites;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

@Entity
@Table (name = "EMPLOYEE")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="EMPID")
	private int empid;
	
	@Column(name="FIRST",length=45)
	private String first;
		
	@Column(name="LAST",length=45)
	private String last;
	
	@Column(name="EMAIL",length=225)
	private String email;
	
	@Column(name="dob",length=12)
	private String dob;
	
	@Column(name="dept",length=40)
	private String department;
	
	public int getEmpID() {
		return empid;
	}

	public void setEmpID(int empid) {
		this.empid = empid;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getDob()throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		Date d = null;
		try{
			d = sdf.parse(dob);
			}catch (Exception e ){
			e.printStackTrace();
		}
		return sdf.format(d);
	}
	
	public void setDepartment(String dept){
		this.department = dept;
	}
	
	public String getDepartment() {
		
		return  department;
	}
	public Employee() {
		
	}

	public Employee(int empid, String first, String last, String email, String dob, String dept) {
		this.empid = empid;
		this.first = first;
		this.last = last;
		this.email = email;
		this.dob = dob;
		this.department = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", first=" + first + ", last=" + last + ", email=" + email + ", dob=" + dob + " , dept= " + department + "]";
	}
	
	
	
	
}
