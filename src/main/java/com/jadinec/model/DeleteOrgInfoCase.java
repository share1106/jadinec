package com.jadinec.model;

import lombok.Data;

@Data
public class DeleteOrgInfoCase {

	private int id;
	private int org_id;
	private String expected;

}
