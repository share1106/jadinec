package com.jadinec.model;

import lombok.Data;

@Data
public class OrganizationInfo {

	private int id;
	private int built_in;
	private int org_type;
	private int org_category;
	private String org_code;
	private String logo_img;
	private String org_name;
	private String nick_name;
	private String unified_social_credit_code;
	private String reg_capital;
	private String reg_address;
	private String legal_rep_person;
	private String open_bank;
	private String open_back_account;
	private String office_address;
	private String contact_mobile;
	private String org_address;
	private String org_web_site;
	private String org_email;
	private String description;
	private String security_cert_code;
	private String business_license_code;
	private String pimm_license;
	private String account_open_license_code;
	private String business_scope;
	private String operating_status;
	private String province;
	private String city;
	private String area;
	private String industry;
	private String incorporation_date;
	private int is_delete;
	private String add_time;
	private String update_time;
	private String org_level_code;
	
	public String getInfo() {
		return null;
	}
}
