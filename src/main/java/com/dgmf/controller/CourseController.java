package com.dgmf.controller;

import com.dgmf.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    // http://localhost:8080/api/v1/courses
    @GetMapping
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1L, "Learn AWS", "John Doe"),
                new Course(2L, "Learn DevOps", "Roland Guerry")
        );
    }
}
