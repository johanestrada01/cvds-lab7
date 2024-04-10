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

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {this.employeeService = employeeService;}

/*
    @GetMapping("/example")
    public String example(Model model) {
        model.addAttribute("gerente", employeeService.getGerente());
        return "example";
    }
*/

    @GetMapping("/index/api")
    public String exampleApi() {
        return "index";
    }

    @GetMapping("/index/api/employees")
    @ResponseBody
    public List<Employee> exampleApiConfigurations() {
        return employeeService.getAllEmployee();
    }


    @PostMapping("/index/api/employees")
    @ResponseBody
    public List<Employee> exampleApiConfigurations(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employeeService.getAllEmployee();
    }

    public Employee getEmployee(String id){
        Optional<Employee> result=employeeService.getEmployee(id);
        if (result.isPresent()){
            return result.get();
        }
        return null;
    }
}
