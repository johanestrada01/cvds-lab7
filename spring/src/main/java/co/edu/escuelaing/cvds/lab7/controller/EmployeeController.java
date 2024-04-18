package co.edu.escuelaing.cvds.lab7.controller;

import co.edu.escuelaing.cvds.lab7.model.Configuration;
import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    //@Autowired
    public EmployeeController(EmployeeService employeeService) {this.employeeService = employeeService;}

    @GetMapping("/main/api")
    public String mainApi(Model model){
        List<Employee> employees=employeeService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "employee";
    }

    /*

    @PostMapping("/example/api/employee")
    @ResponseBody
    public List<Employee> getEmployees(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employeeService.getAllEmployee();
    }

    @GetMapping("/example/api")
    public String exampleApi() {
        return "example-api";
    }

    @GetMapping("/example/api/employee")
    @ResponseBody
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    */
}
