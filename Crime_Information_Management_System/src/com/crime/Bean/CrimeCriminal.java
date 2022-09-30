package com.crime.Bean;

public class CrimeCriminal {
	
	private int CriminalId;
	private int Section;
	private boolean Status;
	
	public CrimeCriminal() {
		
		// TODO Auto-generated constructor stub
	}
	public CrimeCriminal(int criminalId, int section,boolean status) {
		super();
		CriminalId = criminalId;
		Section = section;
		Status = status;
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
		return "CrimeCriminal [CriminalId=" + CriminalId + ", Section=" + Section + ", Status="+Status+"]";
	}
	public boolean getStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	

}
