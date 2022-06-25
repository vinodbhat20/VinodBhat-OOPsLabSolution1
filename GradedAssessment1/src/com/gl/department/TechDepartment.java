package com.gl.department;

public class TechDepartment extends SuperDepartment{

	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	}
}
