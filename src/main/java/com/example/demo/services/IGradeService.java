package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Grade;
import com.example.demo.models.Student;
import com.example.demo.models.Subject;

public interface IGradeService {

	ArrayList<Grade> getAllGradesByStudent(Student student) throws Exception;
	
	ArrayList<Grade> getAllGradesBySubject(Subject subject) throws Exception;
	
//	Product readById(int id) throws Exception;
	
//	boolean updateById(int id, Product tmp);
	
	void deleteById(int id) throws Exception;
	
	
	
}
