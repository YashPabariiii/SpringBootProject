package com.SpringBootProject.repository;

import com.SpringBootProject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
// public Department findbyDepartmentName(String departmentName);
}
