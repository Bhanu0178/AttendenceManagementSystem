package com.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TeachersLoginBean implements Serializable 
{
	private String name = null;
	private String rollNo = null;
	private String pWord = null;
	private String subject = null;
	
	public TeachersLoginBean() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getpWord() {
		return pWord;
	}

	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
