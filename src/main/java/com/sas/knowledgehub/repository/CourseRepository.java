package com.sas.knowledgehub.repository;

import com.sas.knowledgehub.data.entities.Course;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

    Course findByTitle(String title);

    Optional<Course> findById(Long id);

}