package com.niit.springcore;
//Loosely Coupled Class
//Bean or Model or Pojo class
public class Employee {
	
	private int eid;
	private String ename;
	Address eaddress;
	
	public Employee() {

	}

	public Employee(Address eaddress) {
		super();
		this.eaddress = eaddress;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getEaddress() {
		return eaddress;
	}

	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}

	
	

	
}
