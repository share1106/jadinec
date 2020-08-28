package com.jadinec.model;

import lombok.Data;

@Data
public class GetOrgInfoByIdCase {

	private int id;
	private int org_id;
	private String expected;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public String getExpected() {
		return expected;
	}
	public void setExpected(String expected) {
		this.expected = expected;
	}
	
	@Override
	public String toString() {
		return (
				"{id:" + id + "," +
				"org_id:" + org_id + "," + 
				"expected:" + expected + "}" );
	}
	
	
}
