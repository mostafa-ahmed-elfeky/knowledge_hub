package com.sas.knowledgehub.repository;

import com.sas.knowledgehub.data.entities.CourseEnrollment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEnrollmentRepository extends CrudRepository<CourseEnrollment, Long> {

    CourseEnrollment findByUserIdAndCourseId(Long userId, Long courseId);

}