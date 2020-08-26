package com.jadinec.model;

import lombok.Data;

@Data
public class GetOrgInfoByIdCase {

	private int id;
	private int org_id;
	private String expected;
	@Override
	public String toString() {
		return (
				"{id:" + id + "," +
				"org_id:" + org_id + "," + 
				"expected:" + expected + "}" );
	}
	
	
}
