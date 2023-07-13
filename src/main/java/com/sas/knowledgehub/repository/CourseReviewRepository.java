package com.sas.knowledgehub.repository;

import com.sas.knowledgehub.data.entities.CourseReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseReviewRepository extends CrudRepository<CourseReview, Long> {

    CourseReview findByUserIdAndCourseId(Long userId, Long courseId);

}