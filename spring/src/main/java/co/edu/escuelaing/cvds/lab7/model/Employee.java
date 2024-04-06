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
    private String employeeId;
    @Column(name = "FIRST_NAME")
    private String firtsName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "ROLE")
    private String role;
    @Column(name = "SALARY")
    private float salary;

    public Employee(){}

    public Employee(String id, String firstName, String lastName, String role, float salary){
        this.employeeId=id;
        this.firtsName=firstName;
        this.lastName=lastName;
        this.role=role;
        this.salary=salary;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }

    public String getFirtsName(){
        return this.firtsName;
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
        this.employeeId=id;
    }

    public void setFirstName(String name){
        this.firtsName=name;
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
        result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
        result = prime * result + ((firtsName == null) ? 0 : firtsName.hashCode());
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
        if(employeeId == null){
            if(other.getEmployeeId() != null){
                return false;
            }
        }
        else if(!employeeId.equals(other.getEmployeeId())){
            return false;
        }
        if(firtsName == null){
            if(other.getFirtsName() != null){
                return false;
            }
        }
        else if(!firtsName.equals(other.getFirtsName())){
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
