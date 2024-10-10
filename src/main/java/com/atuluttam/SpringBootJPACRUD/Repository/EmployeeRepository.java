package com.atuluttam.SpringBootJPACRUD.Repository;

import com.atuluttam.SpringBootJPACRUD.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
