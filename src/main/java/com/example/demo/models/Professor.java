package com.example.demo.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
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

public class Professor {
	@Column(name="IdPr")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.NONE)
	private long idPr;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;
	
	@Column(name="Degree")
	private Degree degree;

	
	
	
	
	//professoram ir vairaki kursi
	//@OneToMany
	//private Collection<course> course
	
	
	//viens-pret-viens
	/*
	@OneToOne(mappedBy = "professor")
	@ToString.Exclude
	private Subject subject;
	*/
	
	@ManyToMany(mappedBy = "professors")
	@ToString.Exclude
	private Collection<Subject> subjects = new ArrayList<Subject>();
	
	public void addNewSubject(Subject sub)
	{
		subjects.add(sub);
	}

	
	//2. get un set no lombok
	
	
	//3.1 bezargumenta konstruktors - lombok
	
	//3.2 argumenta konstruktors
	
	public Professor(String name, String surname, Degree degree) {
		super();
		this.name = name;
		this.surname = surname;
		this.degree = degree;
	}
	
	//4. toString - lombok
	
	

}
