package com.SpringBootProject.service;

import com.SpringBootProject.entity.Department;
import com.SpringBootProject.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchallDept();

   public Department fetchdeptbyid(Long departmentId) throws DepartmentNotFoundException;

   public void deletedeptbyid(Long departmentId);

   public Department updatedept(Long departmentId, Department department);

}
