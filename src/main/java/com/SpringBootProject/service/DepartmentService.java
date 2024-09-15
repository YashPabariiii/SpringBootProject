package com.SpringBootProject.service;

import com.SpringBootProject.entity.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchallDept();

   public Department fetchdeptbyid(Long departmentId);

   public void deletedeptbyid(Long departmentId);

   public Department updatedept(Long departmentId, Department department);

   Department getdeptbyname(String departmentName);
}
