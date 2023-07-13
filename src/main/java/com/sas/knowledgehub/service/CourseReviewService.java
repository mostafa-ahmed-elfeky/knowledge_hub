package com.sas.knowledgehub.service;

import com.sas.knowledgehub.data.entities.CourseReview;
import com.sas.knowledgehub.repository.CourseReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseReviewService {

    private final CourseReviewRepository courseReviewRepository;


    public CourseReview findByUserIdAndCourseId(Long userId, Long courseId) {
        return courseReviewRepository.findByUserIdAndCourseId(userId, courseId);
    }

}