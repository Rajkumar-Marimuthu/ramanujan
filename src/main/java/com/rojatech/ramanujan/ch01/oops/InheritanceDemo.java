package com.rojatech.ramanujan.ch01.oops;
import java.util.Arrays;
import java.util.Date;

enum OrgType {
	COLLEGE,
	HOSPITAL,
	SHOP,
	MANUFACTURING
}

class Organization {
	private String orgName;
	private OrgType orgType;
	private String[] owners;
	private String location;
	private Date yearOfEstablish;
	
	// To define any constant
	private static final String CHANCELLOR = "Governor"; 
	
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public OrgType getOrgType() {
		return orgType;
	}
	public void setOrgType(OrgType orgType) {
		this.orgType = orgType;
	}
	public String[] getOwners() {
		return owners;
	}
	public void setOwners(String[] owners) {
		this.owners = owners;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getYearOfEstablish() {
		return yearOfEstablish;
	}
	public void setYearOfEstablish(Date yearOfEstablish) {
		this.yearOfEstablish = yearOfEstablish;
	}
	
	@Override
	public String toString() {
		return "Organization [orgName=" + orgName + ", orgType=" + orgType + ", owners=" + Arrays.toString(owners)
				+ ", location=" + location + ", yearOfEstablish=" + yearOfEstablish + " Chancellor=" + CHANCELLOR +"]";
	}
	
	
}

class College extends Organization {

	public College() {
		super();
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Organization srm = new College();
		srm.setLocation("chennai");
		
		System.out.println(srm.toString());
		

	}

}
