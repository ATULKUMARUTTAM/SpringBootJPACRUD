package com.atuluttam.SpringBootJPACRUD.Service;


import com.atuluttam.SpringBootJPACRUD.Model.Employee;
import com.atuluttam.SpringBootJPACRUD.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository er;

    public Employee saveEmp(Employee e)
    {
         return er.save(e);
    }


    public Employee searchById(Long id)
    {
        return er.findById(id).orElse(null) ;
    }

    public List<Employee> getAllEmp()
    {
        return er.findAll();
    }

    public String removeEmpById(Long id)
    {
        er.deleteById(id);
        return "Employee deleted!!!";
    }

    public String removeAll()
    {
        er.deleteAll();
        return "All Emp deleted!!!";
    }

    public Employee updateEmp(Long id, Employee e)
    {
       Employee e1 =  searchById(id);
       e1.setAge(e.getAge());
       e1.setName(e.getName());
       return er.save(e1);
    }




}
