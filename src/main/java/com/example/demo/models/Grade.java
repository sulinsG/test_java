package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

public class Grade {
	@Column(name="IdG")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.NONE)
	private long IdG;
	
	@Column(name="Value")
	private int value;
			
	@ManyToOne
	@JoinColumn(name = "IdSt")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "IdSbj")
	private Subject subject;

	public Grade(int value, Student student, Subject subject) {
		//super();
		setValue(value);
		setStudent(student);;
		setSubject(subject);
	}

	


}


	
	

