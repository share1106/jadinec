package com.jadinec.model;

import lombok.Data;

@Data
public class OrganizationInfoCase {

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
	
	@Override
	public String toString() {
		return (
				"{id:" + id + "," +
				"built_in:" + built_in + "," + 
				"org_type:" + org_type + "," + 
				"org_category:" + org_category + "," + 
				"org_code:" + org_code + "," +
				"logo_img:" + logo_img + "," + 
				"org_name:" + org_name + "," + 
				"nick_name:" + nick_name + "," + 
				"unified_social_credit_code:" + unified_social_credit_code + "," + 
				"reg_capital:" + reg_capital + "," + 
				"reg_address:" + reg_address + "," + 
				"legal_rep_person:" + legal_rep_person + "," + 
				"open_bank:" + open_bank + "," + 
				"open_back_account:" + open_back_account + "," + 
				"office_address:" + office_address + "," + 
				"contact_mobile:" + contact_mobile + "," + 
				"org_address:" + org_address + "," + 
				"org_web_site:" + org_web_site + "," + 
				"org_email:" + org_email + "," + 
				"description:" + description + "," + 
				"security_cert_code:" + security_cert_code + "," + 
				"business_license_code:" + business_license_code + "," + 
				"pimm_license:" + pimm_license + "," + 
				"account_open_license_code:" + account_open_license_code + "," + 
				"business_scope:" + business_scope + "," + 
				"operating_status:" + operating_status + "," + 
				"province:" + province + "," + 
				"city:" + city + "," + 
				"area:" + area + "," + 
				"industry:" + industry + "," +
				"incorporation_date:" + incorporation_date + "," +
				"is_delete:" + is_delete + "," +
				"add_time:" + add_time + "," +
				"update_time:" + update_time + "," +
				"org_level_code:" + org_level_code + "}"
				);
	}
}
