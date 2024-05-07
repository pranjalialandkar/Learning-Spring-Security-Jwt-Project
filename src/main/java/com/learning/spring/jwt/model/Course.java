package com.learning.spring.jwt.model;

public class Course {
	private String name;
	private String author;
	
	public Course(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", author=" + author + "]";
	}
	
	

}
