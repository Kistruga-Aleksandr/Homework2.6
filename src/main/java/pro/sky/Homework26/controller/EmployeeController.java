package pro.sky.Homework26.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Homework26.Employee;
import pro.sky.Homework26.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam("lastName") String lastName, @RequestParam("firstName") String firstName) {
        return employeeService.addEmployee(lastName, firstName);
    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam("lastName") String lastName, @RequestParam("firstName") String firstName) {
        return employeeService.removeEmployee(lastName, firstName);
    }

    @GetMapping(path = " /find")
    public Employee getEmployee(@RequestParam("lastName") String lastName, @RequestParam("firstName") String firstName) {

        return employeeService.getEmployee(lastName, firstName);
    }

    @GetMapping()
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }


}
