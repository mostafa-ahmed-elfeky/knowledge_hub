package com.sas.knowledgehub.service;

import com.sas.knowledgehub.data.entities.CourseEnrollment;
import com.sas.knowledgehub.repository.CourseEnrollmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseEnrollmentService {

    private final CourseEnrollmentRepository courseEnrollmentRepository;


    public CourseEnrollment findByUserIdAndCourseId(Long userId, Long courseId) {
        return courseEnrollmentRepository.findByUserIdAndCourseId(userId, courseId);
    }

}