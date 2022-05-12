package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Grade;
import com.example.demo.models.Student;
import com.example.demo.models.Subject;

public interface IGradeService {

	ArrayList<Grade> getAllGradesByStudent(Student student) throws Exception;
	
	ArrayList<Grade> getAllGradesBySubject(Subject subject) throws Exception;
		
	ArrayList<Grade> getAllGradesByStudentName(String name) throws Exception;
	ArrayList<Grade> getAllFailingGradesBySubject(Subject subject) throws Exception;
	int getGradeAverageBySubject(Subject subject)throws Exception;
	int getGradeAverageByStudent(Student student)throws Exception;
	
	
}
