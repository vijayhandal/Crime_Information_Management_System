package com.crime.Bean;

public class Criminal {
	
	private int CriminalId;
	private String Name;
	private int Age;
	private String Gender;
	private String Address;
	private String Identifying_mark;
	private String first_arrested_Area;
	private String Which_Crime;
	
	public Criminal() {
		// TODO Auto-generated constructor stub
	}

	public Criminal(int criminalId, String name, int age, String gender, String address, String identifying_mark,String first_arrested_Area, String which_Crime) {
		super();
		CriminalId = criminalId;
		Name = name;
		Age = age;
		Gender = gender;
		Address = address;
		Identifying_mark = identifying_mark;
		this.first_arrested_Area = first_arrested_Area;
		Which_Crime = which_Crime;
	}

	public int getCriminalId() {
		return CriminalId;
	}

	public void setCriminalId(int criminalId) {
		CriminalId = criminalId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getIdentifying_mark() {
		return Identifying_mark;
	}

	public void setIdentifying_mark(String identifying_mark) {
		Identifying_mark = identifying_mark;
	}

	public String getFirst_arrested_Area() {
		return first_arrested_Area;
	}

	public void setFirst_arrested_Area(String first_arrested_Area) {
		this.first_arrested_Area = first_arrested_Area;
	}

	public String getWhich_Crime() {
		return Which_Crime;
	}

	public void setWhich_Crime(String which_Crime) {
		Which_Crime = which_Crime;
	}

	@Override
	public String toString() {
		return "Criminal [CriminalId=" + CriminalId + ", Name=" + Name + ", Age=" + Age + ", Gender=" + Gender
				+ ", Address=" + Address + ", Identifying_mark=" + Identifying_mark + ", first_arrested_Area="
				+ first_arrested_Area + ", Which_Crime=" + Which_Crime + "]";
	}
	
	

}
