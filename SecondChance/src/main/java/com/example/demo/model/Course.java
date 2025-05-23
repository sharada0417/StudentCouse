package com.example.demo.model;

public class Course {
	private int courseId;
	private String CourseName;
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		CourseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}	
}
