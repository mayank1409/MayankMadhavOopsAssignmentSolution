package com.gl.department.derived;

import com.gl.department.base.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}