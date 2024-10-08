package com.SpringBootProject.controller;

import com.SpringBootProject.entity.Department;
import com.SpringBootProject.error.DepartmentNotFoundException;
import com.SpringBootProject.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment( @Valid @RequestBody Department department){
        LOGGER.info("Inside the saveDepartment method");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchallDept(){
        LOGGER.info("Inside the fetchallDepartment method");
        return departmentService.fetchallDept();
    }

    @GetMapping("/departments/{id}")
    public Department fetchdeptbyid(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        LOGGER.info("Inside the fetchDepartmentbyid method");
        return departmentService.fetchdeptbyid(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deletedeptbyid(@PathVariable("id") Long departmentId){
        LOGGER.info("Inside the deleteDepartmentbyid method");
        departmentService.deletedeptbyid(departmentId);
          return "Deleted the department Successfully";
    }

    @PutMapping("departments/{id}")
    public Department updatedept( @PathVariable("id") Long departmentId,@RequestBody Department department){
        LOGGER.info("Inside the updateDepartment method");
        return departmentService.updatedept(departmentId,department);
    }
}
