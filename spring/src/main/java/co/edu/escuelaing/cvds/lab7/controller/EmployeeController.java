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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @GetMapping("/main/api/insert")
    public String insertApi() {
        return "employee-insert";
    }

    @GetMapping("/main/api/employee")
    @ResponseBody
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/main/api/employee")
    @ResponseBody
    public List<Employee> insertData(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/main/api/delete/{id}")
    public void deleteEmployee(@PathVariable("id") String id) {
        this.employeeService.deleteEmployee(id);    
    }
    
    @PostMapping("/main/api/update")
    @ResponseBody
    public void updateEmployee(@RequestBody Employee employee){
        String id=employee.getIdEmployee();
        employeeService.deleteEmployee(id);
        employeeService.addEmployee(employee);
    }

    @GetMapping("/main/api/get/{id}")
    public Employee getEmployee(@RequestParam String id) { 
        return employeeService.getEmployee(id).get();
    }

    @GetMapping("/main/api/update/data/{id}")
    public String update(Model model, @PathVariable("id") String id) {
        Employee employee=employeeService.getEmployee(id).get();
        model.addAttribute("employee", employee);
        return "employee-update";
    }
    

}
