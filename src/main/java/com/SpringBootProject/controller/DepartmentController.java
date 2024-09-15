package com.SpringBootProject.controller;

import com.SpringBootProject.entity.Department;
import com.SpringBootProject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchallDept(){
        return departmentService.fetchallDept();
    }

    @GetMapping("/departments/{id}")
    public Department fetchdeptbyid(@PathVariable("id") Long departmentId){
        return departmentService.fetchdeptbyid(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deletedeptbyid(@PathVariable("id") Long departmentId){
        departmentService.deletedeptbyid(departmentId);
          return "Deleted the department Successfully";
    }

    @PutMapping("departments/{id}")
    public Department updatedept( @PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updatedept(departmentId,department);
    }

    @GetMapping("departments/name/{name}")
    public Department getdeptbyname(@PathVariable("name") String departmentName){
        return departmentService.getdeptbyname(departmentName);
    }
}
