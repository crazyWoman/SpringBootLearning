package rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetterRestSample {

    @GetMapping("/employeeName")
    public String getEmployee(){
        return  "smitha";
    }

     @GetMapping("/employeeName/{id}")
    public String getEmployeeById(@PathVariable ("id") final String id){
        if(id.equalsIgnoreCase("1"))
         return  "smitha";
        else
           return "albert" ;
    }


    @GetMapping("/employeeDept")
    public String getEmployeeDept(@RequestParam("name") final String name){
        if(name.equalsIgnoreCase("albert"))
            return  "manufact";
        else
            return "cca" ;
    }

    @GetMapping("/employeeName/{fname}/test3/{lname}")
    public String getEmployeeByLastAndFirstName(@PathVariable ("fname") final String firstName,@PathVariable ("lname") final String lastName){
        if(firstName.equalsIgnoreCase("smitha"))
            return  "smitha"+lastName;
        else
            return "albert" +lastName;
    }
    @GetMapping("/employeeName/{fname}/test2/{lname}")
    public String getEmployeeByLastAndFirstNameRequired(@PathVariable ("fname") final String firstName,@PathVariable ("lname") final String lastName){
        if(firstName.equalsIgnoreCase("smitha"))
            return  "smitha"+lastName;
        else
            return "albert" +lastName;
    }

    @GetMapping("/employeeName/{fname}/test/{lname}")
    public String getEmployeeByLastAndFirstNameNotRequired(@PathVariable ("fname") final String firstName,@PathVariable (value = "lname",required = false) final String lastName ){
        if(firstName.equalsIgnoreCase("smitha"))
            return  "smitha";
        else
            return "albert";
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeByIdAndReturnEmployee(@PathVariable ("id") final String id) {
        if (id.equalsIgnoreCase("1")){
             return new Employee.EmployeeBuilder().
                    withFname("smitha").withLname("meenekkodath").withEmpid(340).
                    build();
    }
        return new Employee.EmployeeBuilder().
                withFname("albert").withLname("hernadez").withEmpid(340).
                build();
    }

    @GetMapping("/employeeentity/{id}")
    public ResponseEntity<Employee> getEmployeeByIdEntity(@PathVariable ("id") final String id) {

        return ResponseEntity.ok().body(new Employee.EmployeeBuilder().
                withFname("smitha").withLname("meenekkodath").withEmpid(340).
                build());

    }
}
