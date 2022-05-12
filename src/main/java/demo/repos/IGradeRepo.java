package demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Grade;

public interface IGradeRepo extends CrudRepository<Grade, Integer> {

}
