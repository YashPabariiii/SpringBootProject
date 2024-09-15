package com.SpringBootProject.service;

import com.SpringBootProject.entity.Department;
import com.SpringBootProject.repository.DepartmentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static org.apache.logging.log4j.util.StringBuilders.equalsIgnoreCase;

@Service
public class DepartmentServiceImplementation implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
       return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchallDept() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchdeptbyid(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deletedeptbyid(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updatedept(Long departmentId, Department department) {
       Department deptfromdb= departmentRepository.findById(departmentId).get();
       if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
           deptfromdb.setDepartmentName(department.getDepartmentName());
       }
       if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
           deptfromdb.setDepartmentCode(department.getDepartmentCode());
       }
       if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
           deptfromdb.setDepartmentAddress(department.getDepartmentAddress());
       }
       return departmentRepository.save(deptfromdb);
    }
}
