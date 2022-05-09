package boot.Employee.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "employee")
public class Employee {

    private UUID token;
    User employeeModel;

    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "token=" + token +
                ", employeeModel=" + employeeModel +
                '}';
    }




    public Employee(UUID token) {
        this.token = token;
    }

    public UUID getToken() {
        return token;
    }

    public Employee(UUID token, User employeeModel) {
        this.token = token;
        this.employeeModel = employeeModel;
    }

    public void setToken(UUID token) {
        this.token = token;
    }

    public User getEmployeeModel() {
        return employeeModel;
    }

    public void setEmployeeModel(User employeeModel) {
        this.employeeModel = employeeModel;
    }


    public Employee(User employeeModel) {
      this.employeeModel = employeeModel;
    }


}
