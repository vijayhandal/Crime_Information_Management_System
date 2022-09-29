package com.crime.Bean;

public class CrimeCriminal {
	
	private int CriminalId;
	private int Section;
	public CrimeCriminal() {
		
		// TODO Auto-generated constructor stub
	}
	public CrimeCriminal(int criminalId, int section) {
		super();
		CriminalId = criminalId;
		Section = section;
	}
	public int getCriminalId() {
		return CriminalId;
	}
	public void setCriminalId(int criminalId) {
		CriminalId = criminalId;
	}
	public int getSection() {
		return Section;
	}
	public void setSection(int section) {
		Section = section;
	}
	@Override
	public String toString() {
		return "CrimeCriminal [CriminalId=" + CriminalId + ", Section=" + Section + "]";
	}
	

}
