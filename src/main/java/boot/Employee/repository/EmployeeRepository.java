package boot.Employee.repository;

import boot.Employee.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;


@Component
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

    @Query(value = "{'employeeModel._id' : ?0 }")
    Employee findBy_Id(int id);
}



