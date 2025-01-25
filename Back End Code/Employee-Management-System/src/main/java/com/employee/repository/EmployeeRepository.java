package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
