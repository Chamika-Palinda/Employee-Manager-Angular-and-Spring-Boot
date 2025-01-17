package com.chamika.Employee.Manager.Angular.and.Spring.Boot.repo;

import com.chamika.Employee.Manager.Angular.and.Spring.Boot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
