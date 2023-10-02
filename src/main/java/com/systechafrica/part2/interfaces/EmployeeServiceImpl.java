package com.systechafrica.part2.interfaces;

import com.systechafrica.part2.accessmodifiers.Employee;

import java.util.UUID;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public Employee createEmployee(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        return employee;
    }


}
