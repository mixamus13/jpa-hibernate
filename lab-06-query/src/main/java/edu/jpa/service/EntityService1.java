package edu.jpa.service;

import edu.jpa.entity.Employee;

import java.util.List;

public class EntityService1 extends EntityService {

    @Override
    public List<Employee> getEmployeesByDepartmentName(String name) {
        return null;
    }

    @Override
    public List<DepartmentInfo> getDepartmentsInfo() {
        return null;
    }
}
