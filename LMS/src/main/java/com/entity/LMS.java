package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LMS {

	@Id
	private int S_no;
	@Column(unique=true)
	private int B_ID;
	private String B_Name;
	private String B_Author;
	private String B_Issued_To;
	private String Issue_Date;
	
	
	
}
