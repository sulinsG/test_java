package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.demo.models.Grade;
import com.example.demo.models.Student;
import com.example.demo.models.Subject;
import com.example.demo.services.IGradeService;

@Service
public class GradeService implements IGradeService {


	
	@Override
	public ArrayList<Grade> getAllFailingGradesBySubject(Subject subject) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Grade> getAllGradesByStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Grade> getAllGradesByStudentName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Grade> getAllGradesBySubject(Subject subject) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getGradeAverageByStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getGradeAverageBySubject(Subject subject) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
