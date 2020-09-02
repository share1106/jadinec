package com.jadinec.model;

import lombok.Data;

@Data
public class AddOrgInfoCase {

	private String accountOpenLicenseCode;
	private String businessLicenseCode;
	private String contactMobile;
	private String legalRepPerson;
	private String logoImg;
	private String nickName;
	private String officeAddress;
	private String openBackAccount;
	private String openBank;
	private String orgAddress;
	private long orgCategory;
	private String orgCode;
	private String orgEmail;
	private String orgName;
	private long orgType;
	private String orgWebSite;
	private String regAddress;
	private String regCapital;
	private String securityCertCode;
	private String superCompanyCode;
	private String unifiedSocialCreditCode;
	private String expected;

	public String getAccountOpenLicenseCode() {
		return accountOpenLicenseCode;
	}

	public void setAccountOpenLicenseCode(String accountOpenLicenseCode) {
		this.accountOpenLicenseCode = accountOpenLicenseCode;
	}

	public String getBusinessLicenseCode() {
		return businessLicenseCode;
	}

	public void setBusinessLicenseCode(String businessLicenseCode) {
		this.businessLicenseCode = businessLicenseCode;
	}

	public String getContactMobile() {
		return contactMobile;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getLegalRepPerson() {
		return legalRepPerson;
	}

	public void setLegalRepPerson(String legalRepPerson) {
		this.legalRepPerson = legalRepPerson;
	}

	public String getLogoImg() {
		return logoImg;
	}

	public void setLogoImg(String logoImg) {
		this.logoImg = logoImg;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getOpenBackAccount() {
		return openBackAccount;
	}

	public void setOpenBackAccount(String openBackAccount) {
		this.openBackAccount = openBackAccount;
	}

	public String getOpenBank() {
		return openBank;
	}

	public void setOpenBank(String openBank) {
		this.openBank = openBank;
	}

	public String getOrgAddress() {
		return orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public long getOrgCategory() {
		return orgCategory;
	}

	public void setOrgCategory(long orgCategory) {
		this.orgCategory = orgCategory;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgEmail() {
		return orgEmail;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public long getOrgType() {
		return orgType;
	}

	public void setOrgType(long orgType) {
		this.orgType = orgType;
	}

	public String getOrgWebSite() {
		return orgWebSite;
	}

	public void setOrgWebSite(String orgWebSite) {
		this.orgWebSite = orgWebSite;
	}

	public String getRegAddress() {
		return regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getRegCapital() {
		return regCapital;
	}

	public void setRegCapital(String regCapital) {
		this.regCapital = regCapital;
	}

	public String getSecurityCertCode() {
		return securityCertCode;
	}

	public void setSecurityCertCode(String securityCertCode) {
		this.securityCertCode = securityCertCode;
	}

	public String getSuperCompanyCode() {
		return superCompanyCode;
	}

	public void setSuperCompanyCode(String superCompanyCode) {
		this.superCompanyCode = superCompanyCode;
	}

	public String getUnifiedSocialCreditCode() {
		return unifiedSocialCreditCode;
	}

	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

	public String getExpected() {
		return expected;
	}

	public void setExpected(String expected) {
		this.expected = expected;
	}

	@Override
	public String toString() {
		return ("{accountOpenLicenseCode:" + accountOpenLicenseCode + "," +

				"businessLicenseCode:" + businessLicenseCode + "," + "contactMobile:" + contactMobile + ","
				+ "legalRepPerson:" + legalRepPerson + "," + "logoImg:" + logoImg + "," + "nickName:" + nickName + ","
				+ "officeAddress:" + officeAddress + "," + "openBackAccount:" + openBackAccount + "," + "openBank:"
				+ openBank + "," + "orgAddress:" + orgAddress + "," + "orgCategory:" + orgCategory + "," + "orgCode:"
				+ orgCode + "," + "orgEmail:" + orgEmail + "," + "orgName:" + orgName + "," + "orgType:" + orgType + ","
				+ "orgWebSite:" + orgWebSite + "," + "regAddress:" + regAddress + "," + "regCapital:" + regCapital + ","
				+ "securityCertCode:" + securityCertCode + "," + "superCompanyCode:" + superCompanyCode + ","
				+ "unifiedSocialCreditCode:" + unifiedSocialCreditCode + "," + "expected:" + expected + "}");
	}
}
