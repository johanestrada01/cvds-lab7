package co.edu.escuelaing.cvds.lab7.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "EMPLOYEE_ID")
    private String idEmployee;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "ROLE")
    private String role;
    @Column(name = "SALARY")
    private float salary;

    public Employee(){}

    public Employee(String id, String firstName, String lastName, String role, float salary){
        this.idEmployee=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.role=role;
        this.salary=salary;
    }

    public String getEmployeeId(){
        return this.idEmployee;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getRole(){
        return this.role;
    }

    public float getSalary(){
        return this.salary;
    }

    public void setEmployeedId(String id){
        this.idEmployee=id;
    }

    public void setFirstName(String name){
        this.firstName=name;
    }

    public void setLastName(String name){
        this.lastName=name;
    }

    public void setRole(String role){
        this.role=role;
    }

    public void setSalary(float salary){
        this.salary=salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idEmployee == null) ? 0 : idEmployee.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((String.valueOf(salary) == null) ? 0 : role.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if(idEmployee == null){
            if(other.getEmployeeId() != null){
                return false;
            }
        }
        else if(!idEmployee.equals(other.getEmployeeId())){
            return false;
        }
        if(firstName == null){
            if(other.getFirstName() != null){
                return false;
            }
        }
        else if(!firstName.equals(other.getFirstName())){
            return false;
        }
        if(lastName == null){
            if(other.getLastName() != null){
                return false;
            }
        }
        else if(!lastName.equals(other.getLastName())){
            return false;
        }
        if(role == null){
            if(other.getRole() != null){
                return false;
            }
        }
        else if(!role.equals(other.getRole())){
            return false;
        }
        if(salary != other.getSalary()){
            return false;
        }
        return true;
    }
}
