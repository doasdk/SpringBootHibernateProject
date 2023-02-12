package s474155.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s474155.exception.ResourceNotFoundExc;
import s474155.model.Employee;
import s474155.repository.EmployeeRepository;
import s474155.service.EmployeeService;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    EmployeeRepository employeeRepository;



    @GetMapping("/test")
    public String test(){
     return "ok";
    }

    //get
    /*@GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return this.employeeRepository.findAll();
    }*/
    @GetMapping(value = "/employees")
    public List<Employee> findAllEmployees(){
        return employeeService.findAll();
    }



 /*   //get by address
    @GetMapping(value = "/employees/{address}")
    public List<Employee> getByAddress(@PathVariable String address){
        return employeeRepository.getByAddress(address);
    }*/

    /*//get by zagajnikowa
    @GetMapping(value = "/employees/zagajnikowa")
    public List<Employee> getZagajnikowa(String address){
        return employeeRepository.getAllByZagajnikowaAddress(address);
    }*/

    //getById
    @GetMapping("/employees/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable ("id") Long id){
        return employeeService.findById(id);
    }

    /* @GetMapping(value = "/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
        throws ResourceNotFoundExc {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundExc("employee not found"));
        return ResponseEntity.ok().body(employee);
    }*/

    //!!!!!!!!!!!!!!

    //save
    /*@PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return this.employeeRepository.save(employee);
    }*/

    @PostMapping(value = "/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

   /* @PostMapping(value = "/employees")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return ResponseEntity.ok().body(employee);
    }*/

    //update
    @PutMapping(value = "/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }


    /*@PutMapping(value = "/employees")
    public ResponseEntity<Void> edit(@RequestBody Employee employee) {
        Optional<Employee> employeeFromData = employeeRepository.getEmployeeById(employee.getId());
        if(Objects.nonNull(employeeFromData)) {
            employeeRepository.save(employee);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }*/
    //delete
    @DeleteMapping(value = "/employees/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }


    /*@DeleteMapping(value = "/employees/{id}")
    public ResponseEntity<Void> delete(HttpServletResponse response,
                                       @PathVariable Long id){
        employeeRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }*/



}
