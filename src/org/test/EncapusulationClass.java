package org.test;

public class EncapusulationClass {

	// define all data members as private access specifier

	private int rollNo;

	private String stundentName;

	private String StundentAddress;

	private int totalMarks;
	
	//Generate Getters Setters

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
//		int rollNo = rollNo;
		this.rollNo = rollNo;
	}

	public String getStundentName() {
		return stundentName;
	}

	public void setStundentName(String stundentName) {
		this.stundentName = stundentName;
	}

	public String getStundentAddress() {
		return StundentAddress;
	}

	public void setStundentAddress(String stundentAddress) {
		StundentAddress = stundentAddress;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

}
