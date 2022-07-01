package com.victor.dto;

import java.sql.Date;
import java.sql.Time;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class AssignmentDTO {
	
    private Integer id;
    @Min(1)
    private Integer studentid;
    @Min(1)
    private Integer examid;
	private Time time;
    private Date date;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public AssignmentDTO() {
        super();
    }
	
    public AssignmentDTO(int studentID, int examID, Time date) {
        super();
        this.studentid = studentID;
        this.examid = examID;
        this.time = date;
    }
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getExamid() {
		return examid;
	}
	public void setExamid(Integer examidexamid) {
		this.examid = examidexamid;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	


}