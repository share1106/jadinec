package com.jadinec.model;

import lombok.Data;

@Data
public class OrganizationInfo {

	private int id;
	private int orgType;
	private int orgCategory;
	private int orgCode;
	private String superCompanyCode;
	private String logoImg;
	private String orgName;
	private String nickName;
	private String unifiedSocialCreditCode;
	private String regCapital;
	private String regAddress;
	private String legalRepPerson;
	private String openBank;
	private String openBackAccount;
	private String officeAddress;
	private String contactMobile;
	private String orgAddress;
	private String orgWebSite;
	private String orgEmail;
	private String securityCertCode;
	private String businessLicenseCode;
	private String accountOpenLicenseCode;
		
	@Override
	public String toString() {
		return (
				"{id:" + id + "," +
				"orgType:" + orgType + "," + 
				"orgCategory:" + orgCategory + "," + 
				"orgCode:" + orgCode + "," + 
				"superCompanyCode:" + superCompanyCode + "," +
				"logoImg:" + logoImg + "," + 
				"orgName:" + orgName + "," + 
				"nickName:" + nickName + "," + 
				"unifiedSocialCreditCode:" + unifiedSocialCreditCode + "," + 
				"regCapital:" + regCapital + "," + 
				"regAddress:" + regAddress + "," + 
				"legalRepPerson:" + legalRepPerson + "," + 
				"openBank:" + openBank + "," + 
				"openBackAccount:" + openBackAccount + "," + 
				"officeAddress:" + officeAddress + "," + 
				"contactMobile:" + contactMobile + "," + 
				"orgAddress:" + orgAddress + "," + 
				"orgWebSite:" + orgWebSite + "," + 
				"orgEmail:" + orgEmail + "," + 
				"securityCertCode:" + securityCertCode + "," + 
				"businessLicenseCode:" + businessLicenseCode + "," + 
				"accountOpenLicenseCode:" + accountOpenLicenseCode + "}"
				);
	}
}
