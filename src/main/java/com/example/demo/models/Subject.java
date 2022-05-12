package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

public class Subject {
	
	@Column(name = "IdSbj")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.NONE)
	private long idSbj;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "CreditPoints")
	private int creditPoints;

	
	
	
	
	//vairakiem kursiem ir viens profesors
	//@ManyToOne
	//
	
	
	
	//viens-pret-viens
	@OneToOne
	@JoinColumn(name = "IdPr")
	private Professor professor;

	
	@OneToMany(mappedBy = "subject")
	@ToString.Exclude
	private Collection<Grade> grades;
	








	public Subject(String title, int creditPoints, Professor professor) {
		super();
		this.title = title;
		this.creditPoints = creditPoints;
		this.professor = professor;
	}
	


	
	

}
