package com.isedin.bean;

import java.sql.Date;

public class AdBean {

	private String title;
	private String companyname;
	private String country;
	private int numberofpersonnel;
	private String sector;
	private String positiontype;
	private String description;
	private String qualifications;
	private String jobfield;
	private String positionlevel;
	private String experience;
	private String educationallevel;
	private Date postingdate;
	private Date updateddate;
	private Date lastapplydate;

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumberofpersonnel() {
		return numberofpersonnel;
	}

	public void setNumberofpersonnel(int numberofpersonnel) {
		this.numberofpersonnel = numberofpersonnel;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getPositiontype() {
		return positiontype;
	}

	public void setPositiontype(String positiontype) {
		this.positiontype = positiontype;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public String getJobfield() {
		return jobfield;
	}

	public void setJobfield(String jobfield) {
		this.jobfield = jobfield;
	}

	public String getPositionlevel() {
		return positionlevel;
	}

	public void setPositionlevel(String positionlevel) {
		this.positionlevel = positionlevel;
	}

	public String getEducationallevel() {
		return educationallevel;
	}

	public void setEducationallevel(String educationallevel) {
		this.educationallevel = educationallevel;
	}

	public Date getPostingdate() {
		return postingdate;
	}

	public void setPostingdate(Date postingdate) {
		this.postingdate = postingdate;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	public Date getLastapplydate() {
		return lastapplydate;
	}

	public void setLastapplydate(Date lastapplydate) {
		this.lastapplydate = lastapplydate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
}
