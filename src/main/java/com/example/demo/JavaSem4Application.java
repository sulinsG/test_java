package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.models.Degree;
import com.example.demo.models.Grade;
import com.example.demo.models.Professor;
import com.example.demo.models.Student;
import com.example.demo.models.Subject;
import com.example.demo.repos.IGradeRepo;
import com.example.demo.repos.IProfessorRepo;
import com.example.demo.repos.IStudentRepo;
import com.example.demo.repos.ISubjectRepo;

@SpringBootApplication
public class JavaSem4Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSem4Application.class, args);
	}
	// ar so anotaciju, funkcija izpildisies automatiski, startejot projektu
	@Bean	
	public CommandLineRunner testDB(IProfessorRepo profRepo, IStudentRepo studRepo,
			ISubjectRepo subjrepo, IGradeRepo gradeRepo)
	{
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
				
				Student st1 = new Student("Janis", "Berzins");
				Student st2 = new Student("Baiba", "Jauka");
				studRepo.save(st1);
				studRepo.save(st2);
				
				
				Professor prof1 = new Professor("Karina", "Skirmante", Degree.master);
				Professor prof2 = new Professor("Estere", "Vitola", Degree.master);
				profRepo.save(prof1);
				profRepo.save(prof2);
			
				Subject subj1 = new Subject("JAVA", 4, Arrays.asList(prof1,prof2));
				Subject subj2 = new Subject("Matematika", 2, Arrays.asList(prof2));
				
				subjrepo.save(subj1);
				subjrepo.save(subj2);
				
				
				prof1.addNewSubject(subj1);
				prof1.addNewSubject(subj2);
				prof2.addNewSubject(subj2);
				profRepo.save(prof1);
				profRepo.save(prof2);
				
				
				gradeRepo.save(new Grade(5,st1,subj1));
				gradeRepo.save(new Grade(7,st1,subj2));
				gradeRepo.save(new Grade(3,st2,subj1));
				gradeRepo.save(new Grade(2,st2,subj2));


				

			
			}
		};
	}
}
