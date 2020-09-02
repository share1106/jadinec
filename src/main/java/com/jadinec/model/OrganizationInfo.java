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
	private String is_delete;
	private String add_time;
	private String update_time;
	private String org_level_code;

	@Override
	public String toString() {
		return ("{id:" + id + "," + "built_in:" + built_in + "," + "org_type:" + org_type + "," + "org_category:"
				+ org_category + "," + "org_code:" + org_code + "," + "logo_img:" + logo_img + "," + "org_name:"
				+ org_name + "," + "nick_name:" + nick_name + "," + "unified_social_credit_code:"
				+ unified_social_credit_code + "," + "reg_capital:" + reg_capital + "," + "reg_address:" + reg_address
				+ "," + "legal_rep_person:" + legal_rep_person + "," + "open_bank:" + open_bank + ","
				+ "open_back_account:" + open_back_account + "," + "office_address:" + office_address + ","
				+ "contact_mobile:" + contact_mobile + "," + "org_address:" + org_address + "," + "org_web_site:"
				+ org_web_site + "," + "org_email:" + org_email + "," + "description:" + description + ","
				+ "security_cert_code:" + security_cert_code + "," + "business_license_code:" + business_license_code
				+ "," + "pimm_license:" + pimm_license + "," + "account_open_license_code:" + account_open_license_code
				+ "," + "business_scope:" + business_scope + "," + "operating_status:" + operating_status + ","
				+ "province:" + province + "," + "city:" + city + "," + "area:" + area + "," + "industry:" + industry
				+ "," + "incorporation_date:" + incorporation_date + "," + "is_delete:" + is_delete + "," + "add_time:"
				+ add_time + "," + "update_time:" + update_time + "," + "org_level_code:" + org_level_code + "}");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBuilt_in() {
		return built_in;
	}

	public void setBuilt_in(int built_in) {
		this.built_in = built_in;
	}

	public int getOrg_type() {
		return org_type;
	}

	public void setOrg_type(int org_type) {
		this.org_type = org_type;
	}

	public int getOrg_category() {
		return org_category;
	}

	public void setOrg_category(int org_category) {
		this.org_category = org_category;
	}

	public String getOrg_code() {
		return org_code;
	}

	public void setOrg_code(String org_code) {
		this.org_code = org_code;
	}

	public String getLogo_img() {
		return logo_img;
	}

	public void setLogo_img(String logo_img) {
		this.logo_img = logo_img;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getUnified_social_credit_code() {
		return unified_social_credit_code;
	}

	public void setUnified_social_credit_code(String unified_social_credit_code) {
		this.unified_social_credit_code = unified_social_credit_code;
	}

	public String getReg_capital() {
		return reg_capital;
	}

	public void setReg_capital(String reg_capital) {
		this.reg_capital = reg_capital;
	}

	public String getReg_address() {
		return reg_address;
	}

	public void setReg_address(String reg_address) {
		this.reg_address = reg_address;
	}

	public String getLegal_rep_person() {
		return legal_rep_person;
	}

	public void setLegal_rep_person(String legal_rep_person) {
		this.legal_rep_person = legal_rep_person;
	}

	public String getOpen_bank() {
		return open_bank;
	}

	public void setOpen_bank(String open_bank) {
		this.open_bank = open_bank;
	}

	public String getOpen_back_account() {
		return open_back_account;
	}

	public void setOpen_back_account(String open_back_account) {
		this.open_back_account = open_back_account;
	}

	public String getOffice_address() {
		return office_address;
	}

	public void setOffice_address(String office_address) {
		this.office_address = office_address;
	}

	public String getContact_mobile() {
		return contact_mobile;
	}

	public void setContact_mobile(String contact_mobile) {
		this.contact_mobile = contact_mobile;
	}

	public String getOrg_address() {
		return org_address;
	}

	public void setOrg_address(String org_address) {
		this.org_address = org_address;
	}

	public String getOrg_web_site() {
		return org_web_site;
	}

	public void setOrg_web_site(String org_web_site) {
		this.org_web_site = org_web_site;
	}

	public String getOrg_email() {
		return org_email;
	}

	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSecurity_cert_code() {
		return security_cert_code;
	}

	public void setSecurity_cert_code(String security_cert_code) {
		this.security_cert_code = security_cert_code;
	}

	public String getBusiness_license_code() {
		return business_license_code;
	}

	public void setBusiness_license_code(String business_license_code) {
		this.business_license_code = business_license_code;
	}

	public String getPimm_license() {
		return pimm_license;
	}

	public void setPimm_license(String pimm_license) {
		this.pimm_license = pimm_license;
	}

	public String getAccount_open_license_code() {
		return account_open_license_code;
	}

	public void setAccount_open_license_code(String account_open_license_code) {
		this.account_open_license_code = account_open_license_code;
	}

	public String getBusiness_scope() {
		return business_scope;
	}

	public void setBusiness_scope(String business_scope) {
		this.business_scope = business_scope;
	}

	public String getOperating_status() {
		return operating_status;
	}

	public void setOperating_status(String operating_status) {
		this.operating_status = operating_status;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIncorporation_date() {
		return incorporation_date;
	}

	public void setIncorporation_date(String incorporation_date) {
		this.incorporation_date = incorporation_date;
	}

	public String getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}

	public String getAdd_time() {
		return add_time;
	}

	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public String getOrg_level_code() {
		return org_level_code;
	}

	public void setOrg_level_code(String org_level_code) {
		this.org_level_code = org_level_code;
	}

}
