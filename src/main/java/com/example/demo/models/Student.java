package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Entity

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {

	@Column(name="IdSt")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.NONE)
	private long idSt;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;

	
	@OneToMany(mappedBy = "student")
	@ToString.Exclude
	private Collection<Grade> grade;
	
	
	public Student(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	

	
	
}
