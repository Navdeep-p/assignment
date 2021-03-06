package boot.Employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Id
    private int id;
    private String name;
    private String dept;
    private String email;
    public User() {
    	
    }
    public User(int id, String name, String dept, String email){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
