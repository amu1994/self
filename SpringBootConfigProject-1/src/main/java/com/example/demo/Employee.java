package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("${my.app.eid}")
	private int eid;
	@Value("${my.app.ename}")
	private String ename;
	@Value("${my.app.esal}")
	private int esal;
	@Value("${my.app.edepartment}")
	private String edepartment;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edepartment=" + edepartment
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
