package rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRest {

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


    @GetMapping("/employeeName/{fname}/{lname}")
    public String getEmployeeByLastAndFirstName(@PathVariable ("fname") final String firstName,@PathVariable ("lname") final String lastName){
        if(firstName.equalsIgnoreCase("smitha"))
            return  "smitha"+lastName;
        else
            return "albert" +lastName;
    }
}
