package rest;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.Annotation;
import java.util.stream.Stream;

@Getter
@Setter
public class Employee {
    int employeeid;
    String fname;
    String lname;



    private Employee (EmployeeBuilder emp){
        this.fname = emp.fname;
        this.lname = emp.lname;
        this.employeeid = emp.employeeid;
    }
public static class EmployeeBuilder{
    int employeeid;
    String fname;
    String lname;
    public EmployeeBuilder withFname(String fname){
       this.fname = fname;
        return this;
    }
    public EmployeeBuilder withLname(String lname){
        this.lname = lname;
        return this;
    }
    public EmployeeBuilder withEmpid(int id){
        this.employeeid = id;
        return this;
    }
    public Employee build(){
        return new Employee(this);
    }
}






}
