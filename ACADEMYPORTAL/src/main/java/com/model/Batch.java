package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BatchTable")
public class Batch {
	@Id
	
	private int batchId;
	@NotNull
	private String batchName;
	@NotNull
	private String course;
	@NotNull
	private String facultyName;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date EndDate;

	public Batch() {
		super();

	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", course=" + course + ", facultyName="
				+ facultyName + ", startDate=" + startDate + ", EndDate=" + EndDate + "]";
	}

}
