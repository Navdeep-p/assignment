package boot.Employee;

import boot.Employee.model.User;
import boot.Employee.service.EmployeeService;
import boot.Employee.exception.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee/registration")
    public UUID saveEmployee(@RequestBody User employeeModel) {
        UUID uuid = null;
        try {
            uuid = employeeService.saveEmployee(employeeModel);
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
        return uuid;
    }

    @GetMapping("/employee")
    public void getIdEmployee() {

        employeeService.findEmployee(12);

    }
}