package demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Subject;

public interface ISubjectRepo extends CrudRepository<Subject, Integer>{

}
