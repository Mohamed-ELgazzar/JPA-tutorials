package iti.jpa;
import jakarta.persistence.*;

@Entity
public class Student extends Person {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

  
    
    
}
