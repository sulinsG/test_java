package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.models.Degree;
import com.example.demo.models.Grade;
import com.example.demo.models.Professor;
import com.example.demo.models.Student;
import com.example.demo.models.Subject;

import demo.repos.IGradeRepo;
import demo.repos.IProfessorRepo;
import demo.repos.IStudentRepo;
import demo.repos.ISubjectRepo;

@SpringBootApplication
public class JavaSem4Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSem4Application.class, args);
	}

	@Bean	// ar so anotaciju, funkcija izpildisies automatiski, startejot projektu
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
			
				Subject subj1 = new Subject("JAVA", 4, prof1);
				Subject subj2 = new Subject("Matematika", 2, prof2);
				
				subjrepo.save(subj1);
				subjrepo.save(subj2);
				
				gradeRepo.save(new Grade(5,st1,subj1));
				gradeRepo.save(new Grade(7,st1,subj2));
				gradeRepo.save(new Grade(3,st2,subj1));
				gradeRepo.save(new Grade(2,st2,subj2));


				

			
			}
		};
	}
}
