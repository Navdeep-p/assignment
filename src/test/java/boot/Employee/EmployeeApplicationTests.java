package boot.Employee;

import boot.Employee.model.Employee;
import boot.Employee.model.User;
import boot.Employee.repository.EmployeeRepository;
import boot.Employee.service.EmployeeService;
import boot.Employee.util.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.util.UUID;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeApplicationTests {
	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepository employeeRepository;

	@MockBean
	private Utils utils;

	@Test
	public void saveEmployeeTest() throws Exception {
		UUID uuid =	utils.generateUuid();
		User user = new User(5,"Navdeep","IT","parash4nu@gmail.com");
		Employee employee = new Employee(uuid,user);
		when(utils.generateUuid()).thenReturn(uuid);
		when(employeeRepository.save(employee)).thenReturn(employee);
		assertEquals(uuid, employeeService.saveEmployee(user));

	}

}
