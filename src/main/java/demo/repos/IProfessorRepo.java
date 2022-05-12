package demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Professor;

public interface IProfessorRepo extends CrudRepository<Professor, Integer> {

}


