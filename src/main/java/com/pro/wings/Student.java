package com.pro.wings;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name="Students")
public class Student {

	@Id
	@Column(name="Roll_Number")
	private int rollno;
	private String name;
	private String city;

	public Student() {
		super();
	}

	public Student(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
