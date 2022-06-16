package com.gl.department;

import com.gl.department.base.SuperDepartment;
import com.gl.department.derived.AdminDepartment;
import com.gl.department.derived.HrDepartment;
import com.gl.department.derived.TechDepartment;

public class TestApplication {

	public static void main(String[] args) {
		
		SuperDepartment department1 = new AdminDepartment();
		SuperDepartment department2 = new HrDepartment();
		SuperDepartment department3 = new TechDepartment();

		System.out.println("Welcome To " + department1.departmentName());
		System.out.println(department1.getTodaysWork());
		System.out.println(department1.getWorkDeadline());
		System.out.println(department1.isTodayAHoliday());

		System.out.println();
		System.out.println();

		System.out.println("Welcome To " + department2.departmentName());
		HrDepartment hrDepartment = (HrDepartment) department2;
		System.out.println(hrDepartment.doActivity());
		System.out.println(department2.getTodaysWork());
		System.out.println(department2.getWorkDeadline());
		System.out.println(department2.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Welcome To " + department3.departmentName());
		System.out.println(department3.getTodaysWork());
		System.out.println(department3.getWorkDeadline());
		TechDepartment techDepartment = (TechDepartment) department3;
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(department3.isTodayAHoliday());
		
	}

}
