package boot.Employee.service;

import boot.Employee.model.Employee;
import boot.Employee.model.User;
import boot.Employee.exception.EmployeeException;
import boot.Employee.repository.EmployeeRepository;
import boot.Employee.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.lang.*;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private Utils utils;


    private final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    
    public UUID saveEmployee(User employeeModel) throws EmployeeException {
      UUID   token = utils.generateUuid();
        Employee employee = new Employee(token, employeeModel);
        String employeeEmail = employee.getEmployeeModel().getEmail();
        String regexEmail = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if(employeeEmail.matches(regexEmail)) {
            employee.setToken(token);
        }
        else {
          throw new EmployeeException("Please Provide The Valid Email.");
        }
        logger.info("saving the user in the database with uuid: " + token );
        employeeRepository.save(employee);
                 return  token;
    }





}
