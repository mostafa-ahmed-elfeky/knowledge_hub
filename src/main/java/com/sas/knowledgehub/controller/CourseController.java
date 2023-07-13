package com.sas.knowledgehub.controller;

import com.sas.knowledgehub.data.dto.CourseDto;
import com.sas.knowledgehub.service.CourseService;
import jakarta.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;


    @GetMapping
    public ResponseEntity<List<CourseDto>> getAllCourses() {
        List<CourseDto> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable Long id) {
        CourseDto course = courseService.findById(id);
        return ResponseEntity.ok(course);
    }

    @PostMapping
    public ResponseEntity<CourseDto> createCourse(@Valid @RequestBody CourseDto course)
        throws URISyntaxException {
        CourseDto newCourse = courseService.createCourse(course);
        return ResponseEntity.created(new URI("/courses/" + newCourse.getId())).body(newCourse);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('INSTRUCTOR')")
    public ResponseEntity<CourseDto> updateCourse(
        @PathVariable Long id,
        @Valid @RequestBody CourseDto course) {
        CourseDto updatedCourse = courseService.updateCourse(id, course);
        return ResponseEntity.ok(updatedCourse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }

}