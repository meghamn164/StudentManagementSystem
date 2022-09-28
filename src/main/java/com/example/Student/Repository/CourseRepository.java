package com.example.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Student.Domain.Course;
 
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
 
}