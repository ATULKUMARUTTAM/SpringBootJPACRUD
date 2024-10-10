package com.atuluttam.SpringBootJPACRUD.Controller;


import com.atuluttam.SpringBootJPACRUD.Model.Employee;
import com.atuluttam.SpringBootJPACRUD.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Emp/home")
public class EmployeeController {
    @Autowired
    EmployeeService es;
    @PostMapping("/save")
    public Employee storeEmp(@RequestBody Employee e)
    {
        return es.saveEmp(e);
    }
}
