package com.crime.Bean;

public class Crime {
	
	
	private int Section;
	private String Date;
	private String Place;
	private String Description;
	private int victims;
	private String detail_description;
	private String suspectedName;
	
	
	public Crime() {
		
		// TODO Auto-generated constructor stub
	}
	public Crime(int section, String date, String place, String description, int victims, String detail_description,
			String suspectedName) {
		super();
		Section = section;
		Date = date;
		Place = place;
		Description = description;
		this.victims = victims;
		this.detail_description = detail_description;
		this.suspectedName = suspectedName;
	}
	public int getSection() {
		return Section;
	}
	public void setSection(int section) {
		Section = section;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getVictims() {
		return victims;
	}
	public void setVictims(int victims) {
		this.victims = victims;
	}
	public String getDetail_description() {
		return detail_description;
	}
	public void setDetail_description(String detail_description) {
		this.detail_description = detail_description;
	}
	public String getSuspectedName() {
		return suspectedName;
	}
	public void setSuspectedName(String suspectedName) {
		this.suspectedName = suspectedName;
	}
	@Override
	public String toString() {
		return "Crime [Section=" + Section + ", Date=" + Date + ", Place=" + Place + ", Description=" + Description
				+ ", victims=" + victims + ", detail_description=" + detail_description + ", suspectedName="
				+ suspectedName + "]";
	}

	
	
}
