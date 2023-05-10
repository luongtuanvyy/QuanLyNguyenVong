package com.modal;

import java.util.List;

public class Student {

	private String id;
	private String fullName;
	private String gender;
	private String YoB;
	private String homeTown;
	private Score score;
	private List<Aspirations> aspirations;

	public Student() {
	}

	public Student(String id, String fullName, String gender, String yoB, String homeTown, com.modal.Score score,
			List<Aspirations> aspirations) {
		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		YoB = yoB;
		this.homeTown = homeTown;
		this.score = score;
		this.aspirations = aspirations;
	}
	
	public float getDUT() {
		return score.getDiemUT();
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getFullName() {
		return fullName;
	}

	public void setFullName(java.lang.String fullName) {
		this.fullName = fullName;
	}

	public java.lang.String getGender() {
		return gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public java.lang.String getYoB() {
		return YoB;
	}

	public void setYoB(java.lang.String yoB) {
		YoB = yoB;
	}

	public java.lang.String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(java.lang.String homeTown) {
		this.homeTown = homeTown;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public List<Aspirations> getAspirations() {
		return aspirations;
	}

	public void setAspirations(List<Aspirations> aspirations) {
		this.aspirations = aspirations;
	}
}
