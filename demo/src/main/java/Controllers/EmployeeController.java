package Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Employee;
import Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/r1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	@GetMapping("/employess/")
	public List<Employee> getAllEmployess(){
		return employeerepository.findAll();
	}
	
	@PostMapping("/employess/")
	public Employee createEmployee(Employee employee) {
		return employeerepository.save(employee);
	}
	
	@GetMapping("/employess/{id}")
	public ResponseEntity<Employee> getAllEmployessByID(@PathVariable long id){
		Employee emp=employeerepository.findById(id)
				.orElseThrow();
		return ResponseEntity.ok(emp);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable long id){
		Employee emp = employeerepository.findById(id)
				.orElseThrow();
		
		employeerepository.delete(emp);
		return ResponseEntity.ok(emp);
	}
	
	

}
