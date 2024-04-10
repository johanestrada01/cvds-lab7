package co.edu.escuelaing.cvds.lab7.controller;

import co.edu.escuelaing.cvds.lab7.model.Configuration;
import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.repository.ConfigurationRepository;
import co.edu.escuelaing.cvds.lab7.repository.EmployeeRepository;
import co.edu.escuelaing.cvds.lab7.service.ConfigurationService;
import co.edu.escuelaing.cvds.lab7.service.EmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @Mock
    private EmployeeRepository mockEmployeeRepository;

    @Mock
    private Model model;

    @InjectMocks
    private EmployeeService employeeService;

    private EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        employeeController = new EmployeeController(employeeService);
    }


    @Test
    void example() {
        //Employee employee = new Employee("1", "Juan", "Contreras", "Gerente", 10000.0f);
        //employeeService.addEmployee(employee);
        Optional<Employee> testOptional=employeeService.getEmployee("1");
        Employee test=testOptional.get();
        String value=test.getEmployeeId();
        standardOut.println(value);
    }

}
