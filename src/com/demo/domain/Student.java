package com.demo.domain;

import java.util.Date;

import com.demo.annotation.ExcelAnnotation;

public class Student {
	
	@SuppressWarnings("unused")
	@ExcelAnnotation(name = "学号")
	private int sno;
	
	@SuppressWarnings("unused")
	@ExcelAnnotation(name = "姓名")
	private String name;
	
	@SuppressWarnings("unused")
	@ExcelAnnotation(name = "日期")
	private Date sbirth;
	
	@SuppressWarnings("unused")
	@ExcelAnnotation(name = "备注")
	private String remarks;
	
	public Student(int sno, String name, Date sbirth, String remarks) {
		super();
		this.sno = sno;
		this.name = name;
		this.sbirth = sbirth;
		this.remarks = remarks;
	}

	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sbirth
	 */
	public Date getSbirth() {
		return sbirth;
	}

	/**
	 * @param sbirth the sbirth to set
	 */
	public void setSbirth(Date sbirth) {
		this.sbirth = sbirth;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
