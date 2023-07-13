package com.sas.knowledgehub.service;

import com.sas.knowledgehub.data.dto.CourseDto;
import com.sas.knowledgehub.data.entities.Course;
import com.sas.knowledgehub.repository.CourseRepository;
import java.util.List;
import java.util.stream.StreamSupport;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;


    public CourseDto findByTitle(String title) {
        var course = courseRepository.findByTitle(title);
        return modelMapper.map(course, CourseDto.class);
    }

    public CourseDto findById(Long id) {
        var course = courseRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("course not found"));
        return modelMapper.map(course, CourseDto.class);
    }

    public List<CourseDto> getAllCourses() {
        var courses =  courseRepository.findAll();
        return StreamSupport.stream(courses.spliterator(), false)
            .map(source -> modelMapper.map(source, CourseDto.class))
            .toList();
    }

    public CourseDto createCourse(CourseDto course) {
        var savedCourse = courseRepository.save(modelMapper.map(course, Course.class));
        return modelMapper.map(savedCourse, CourseDto.class);
    }

    public CourseDto updateCourse(Long id, CourseDto course) {
        var updatedCourse = courseRepository.save(modelMapper.map(course, Course.class));
        return modelMapper.map(updatedCourse, CourseDto.class);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}